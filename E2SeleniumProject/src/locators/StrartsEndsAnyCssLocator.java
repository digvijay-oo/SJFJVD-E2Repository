

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrartsEndsAnyCssLocator {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demowebshop.tricentis.com/");
	
		 driver.findElement(By.linkText("Log in")).click();
		 
		 driver.findElement(By.cssSelector("input[name^='Em']")).sendKeys("digvijay@gmail.com");
		 
		 driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("987654321");
		 
		 driver.findElement(By.cssSelector("input[value*='g i']")).click();
		 
	}
}
