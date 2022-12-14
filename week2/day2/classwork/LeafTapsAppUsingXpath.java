package week2.day2.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsAppUsingXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
		findElement.sendKeys("DemoCSR");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id='password']"));
		findElement2.sendKeys("crmsfa");
		WebElement findElement3 = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		findElement3.click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();


	}

}
