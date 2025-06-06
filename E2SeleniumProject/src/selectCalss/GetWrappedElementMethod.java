package selectCalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriver	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			Thread.sleep(1000);
			
			WebElement dayDD= driver.findElement(By.id("day"));
			
			
			
			WebElement monthDD= driver.findElement(By.id("month"));
			
			
			
			WebElement yearDD= driver.findElement(By.id("year"));
			Thread.sleep(1000);
			
			
	}
}
