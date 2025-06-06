package assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class FlipkartTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
	    
	    
	    driver.findElement(By.xpath("//div[text()='Brand']")).click();
	    driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling :: div")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='Core i7']/preceding-sibling :: div")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='16 GB']/preceding-sibling :: div")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='Operating System']")).click(); 
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling :: div")).click(); 
	    Thread.sleep(500);
	    
	    
	}
}
