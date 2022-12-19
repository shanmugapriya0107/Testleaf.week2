package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_RadioButtonComponents {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Your most favorite browser
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
		
		//UnSelectable	
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[14]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]")).click();
		
		//Find the default select radio button
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]")).click();
		
		//Select the age group (only if not selected)
		
		
 
	}

}
