package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_InputComponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type your name
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]")).sendKeys("Shanmugapriya");
		
		//Append Country to this City.
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys(" " + "India");
		
		//Verify if text box is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")).isEnabled();
		if(enabled)
		{
			System.out.println("The Field is enabled");
		}
		else
		{
			System.out.println("The Field is disabled");
		}
		
		//Clear the typed text.
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]")).clear();
		
		//Retrieve the typed text.
		String attribute = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(attribute);
		
		//Type email and Tab. Confirm control moved to next element.
		WebElement findElement = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']"));
		findElement.sendKeys("shanmugapriya.mickey@gmail.com",Keys.TAB);

		//Type about yourself
		driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']")).sendKeys("Hi! I am Shanmugapriya. Currently working as a Manual tester in NTT Data");
		
		//Text Editor
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Hi! I am Shanmugapriya. Currently working as a Manual tester in NTT Data");
		
		//Just Press Enter and confirm error message*
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		String res = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		if(res.equals("Age is mandatory"))
		{
			System.out.println("The Error message is " +res);
		}
		
		//Label position
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		
		
		
		//Type your name and choose the third option
		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).sendKeys("Shanmugapriya");
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[3]")).click();
		
		Thread.sleep(3000);
		//Type your DOB and confirm  the date chosen
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("7/1/1998", Keys.TAB);
		
		
		//Type number and spin to confirm value changed
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='j_idt106:j_idt118_input']"));
		findElement2.sendKeys("8");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		String attribute2 = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).getAttribute("aria-multiline");
		if(findElement2.equals(attribute2))
		{
			System.out.println("The value is same");
		}
		else
		{
			System.out.println("The values are not same");
		}
		
		//Type random number(1-100) and confirm slider moves correctly
		int x = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation().getX();
		System.out.println(x);
		driver.findElement(By.id("j_idt106:slider")).sendKeys("70");
		int y = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation().getX();
		System.out.println(y);
		if(x!=y)
		{
			System.out.println("Slider position changed");
		}
		
		//Click and confirm keyboard appears
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		boolean enabled2 = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isEnabled();
		if(enabled2==true)
		{
			System.out.println("Keyboard appears");
		}
		else
		{
			System.out.println("Keyboard doesn't appear");
		}
	
		
		
		
		

		
		
		
		
		
	
		
		
	}

}
