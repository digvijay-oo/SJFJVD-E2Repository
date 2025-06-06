package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("iPhone 16",Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//span[text()='iPhone 16 512 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Pink']/../../../..//span[@class='a-price-whole']"));
		System.out.println(price.getText());
		
		driver.findElement(By.xpath("//span[text()='iPhone 16 512 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Pink']/../../../..//button[text()='Add to cart']")).click();
	}
}
