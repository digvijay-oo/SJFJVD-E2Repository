package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Lenovo/Downloads/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(5000);
		String expectedTitle="Order Food & Groceries. Discover the best restaurants. Swiggy it!";
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String wi: allWindows) 
		{
			driver.switchTo().window(wi);
			String actualTitle = driver.getTitle();
			
			if(expectedTitle.equals(actualTitle))
			{
				driver.close();
				break;
			}
		}
		
	}
}
