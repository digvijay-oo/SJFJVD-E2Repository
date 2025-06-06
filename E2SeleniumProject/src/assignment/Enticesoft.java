package assignment;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enticesoft {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		String actualTitle="Pune - Wikipedia";
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("Pune",Keys.ENTER);
		 WebElement wiki = driver.findElement(By.xpath("//span[@jscontroller='msmzHf']//h3[text()='Pune']"));
		
	    Actions act=new Actions(driver);
	    act.keyDown(Keys.CONTROL).perform();
	    wiki.click();
	    act.keyUp(Keys.CONTROL);
	    
	   Set<String> all = driver.getWindowHandles();
	   
	   for( String wi :all) 
	   {
		   driver.switchTo().window(wi);
		  String title = driver.getTitle();
		  if(actualTitle.equals(title)) {
			  System.out.println("This is Wikipedia Page");
			 System.out.println( driver.findElement(By.id("firstHeading")).getText());
			  break;
			  
		  }
	   }
		
		
	}
}
