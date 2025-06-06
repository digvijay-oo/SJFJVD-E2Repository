package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iPhone 16 512 GB: Pink",Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Pink, 512 GB)']/../..//div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(price.getText());
	}
}
