package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Second_DeleteLead {

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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("8861827296");										
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("No records to display in the Lead List");
		driver.close();
		
		
	}

}
