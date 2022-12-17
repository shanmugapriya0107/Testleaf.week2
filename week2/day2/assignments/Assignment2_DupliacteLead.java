package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_DupliacteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR"); //Using id locator
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //Using id locator
		driver.findElement(By.className("decorativeSubmit")).click(); //Using className locator
		driver.findElement(By.linkText("CRM/SFA")).click(); //Using LinkText locator
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
		String attribute = driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).getAttribute("value");
		//System.out.println(attribute);
		System.out.println("The Title of the page is: " + driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String res = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		//System.out.println(res);
		if(attribute.equals(res))
		{
			System.out.println("Same Name");
		}
		else
		{
			System.out.println("Different name");
		}
		driver.close();


	}

}