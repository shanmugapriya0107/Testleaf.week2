package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("DemoCSR");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayasekaran");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8861827296");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriya.mickey@gmail.com");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		driver.findElement(By.linkText("Leads")).click(); //Using LinkText locator
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("(//input[@name='emailAddress'])[1]")).sendKeys("shanmugapriya.mickey@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		System.out.println("The Title of the page is: " + driver.getTitle());
		//driver.findElement(By.linkText("Create Lead")).click();
		if(driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).equals(driver.findElement(By.id("createLeadForm_firstName"))))
				{
			
				}

	}

}
