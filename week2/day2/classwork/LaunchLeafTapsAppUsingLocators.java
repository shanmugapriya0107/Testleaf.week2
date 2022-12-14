package week2.day2.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchLeafTapsAppUsingLocators {

	public static void main(String[] args) {
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
		
		WebElement findElement4 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(findElement4);
		dd1.selectByVisibleText("Conference");
		
		WebElement findElement5 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(findElement5);
		dd2.selectByValue("IND_FINANCE");
		
		WebElement findElement6 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 = new Select(findElement6);
		dd3.selectByIndex(3);


	}

}
