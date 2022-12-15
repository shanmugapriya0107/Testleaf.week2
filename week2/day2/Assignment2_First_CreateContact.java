package week2.day2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_First_CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoCSR"); //Using id locator
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //Using id locator
		driver.findElement(By.className("decorativeSubmit")).click(); //Using className locator
		driver.findElement(By.linkText("CRM/SFA")).click(); //Using LinkText locator
		driver.findElement(By.linkText("Contacts")).click();//Using LinkText locator
		driver.findElement(By.linkText("Create Contact")).click(); //Using LinkText locator
		driver.findElement(By.id("firstNameField")).sendKeys("Shanmugapriya"); //Using id locator
		driver.findElement(By.id("lastNameField")).sendKeys("Jayasekaran"); //Using id locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Priya"); //Using id locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("J"); //Using id locator
		driver.findElement(By.name("departmentName")).sendKeys("IT"); //Using name locator
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Hi, I am Shanmugapriya. Currently I am residing in Bangalore"); //Using collection based Xpath
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("shanmugapriya.mickey@gmail.com"); //Using id locator
		WebElement findElement = driver.findElement(By.name("generalStateProvinceGeoId")); //Using name locator
		Select dd1 = new Select(findElement);
		dd1.selectByVisibleText("Florida"); //Using setVisibleText for Dropdown
		driver.findElement(By.className("smallSubmit")).click(); //Using className locator
		driver.findElement(By.className("subMenuButton")).click(); //Using className locator
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Don't share your contacts with everyone.");	
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		System.out.println("The Title of the page is: " + driver.getTitle());
		//driver.close();
	}

}
