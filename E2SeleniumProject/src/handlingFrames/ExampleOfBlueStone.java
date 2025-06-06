package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfBlueStone {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("fc_widget");
		driver.findElement(By.id("chat-icon")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Digvijay");
	}
}
