package week2.day2.assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_FacebookApplication {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Shanmugapriya");
		driver.findElement(By.name("lastname")).sendKeys("Jayasekaran");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8861827296");
		driver.findElement(By.id("password_step_input")).sendKeys("abc890");
		WebElement findElement = driver.findElement(By.id("day"));
		Select dd1 = new Select(findElement);
		dd1.selectByVisibleText("1");
		WebElement findElement2 = driver.findElement(By.id("month"));
		Select dd2 = new Select(findElement2);
		dd2.selectByVisibleText("Jul");
		WebElement findElement3 = driver.findElement(By.id("year"));
		Select dd3 = new Select(findElement3);
		dd3.selectByVisibleText("1998");
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
		driver.close();
	}
}
