package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("Digvijay");
		Thread.sleep(3000);
		
		 WebElement passwordBox = driver.findElement(By.id("pass"));
		passwordBox.sendKeys("Digvijay");
		Thread.sleep(3000);
	}
}