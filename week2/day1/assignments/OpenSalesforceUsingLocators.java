package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSalesforceUsingLocators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://login.salesforce.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("Testleaf$321");
		WebElement findElement3 = driver.findElement(By.id("Login"));
		findElement3.click();


	}

}
