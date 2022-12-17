package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_Button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click and Confirm title.
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		if(driver.getTitle().equals("Dashboard"))
		{
			System.out.println("The Title is same");
		}
		
		//To navigate to previous page
		driver.navigate().back();
		
		//Confirm if the button is disabled.
		System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled());
		
		//Find the position of the Submit button
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation());
		
		//Find the Save button color
		System.out.println(driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color"));
		
		//Find the height and width of this button
		System.out.println(driver.findElement(By.id("j_idt88:j_idt98")).getSize());
        
		//Mouse over and confirm the color changed
		System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']")).getCssValue("background-color"));
		
		//Click Image Button and Click on any hidden button
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		
		//How many rounded buttons are there?
		
		
		
	}

}
