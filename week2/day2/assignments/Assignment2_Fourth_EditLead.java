package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Fourth_EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Shanmugapriya");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		System.out.println("The Title of the page is: " + driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NTT Data");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The changed name of the company is " +text);
		driver.close();

	}

}
