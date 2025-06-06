package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfDream11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.switchTo().frame(0);
		
//		driver.switchTo().frame("send-sms-iframe");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("regEmail")).sendKeys("7499640543");
		Thread.sleep(2000);
		
//		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("select-selected")).click();
		
	}
}
