package selectCalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectAndDeselectAllOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement multiselectDD = driver.findElement(By.id("multiselect1"));
		
		
	}
}