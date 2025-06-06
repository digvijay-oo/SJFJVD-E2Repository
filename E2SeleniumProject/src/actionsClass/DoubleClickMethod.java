package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver =  new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://omayo.blogspot.com/");
		 
		 WebElement target = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		 
		 Actions act= new Actions(driver);
		 
		//act.moveToElement(target).doubleClick().perform();
		 
		 act.doubleClick(target).perform();
		 
		

	}
}
