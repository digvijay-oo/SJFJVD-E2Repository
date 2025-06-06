package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOrQuitMethods {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.cadbury.co.uk/");
		 Thread.sleep(1000);
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.nestle.in/");
		 String expectedUrl=driver.getCurrentUrl(); // Or we Can Manualy Add The Url
		
		 Thread.sleep(2000);
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://cococart.in/");
		 Thread.sleep(1000);
		 
		 Set<String> allWindowIds = driver.getWindowHandles();
		 
		 for(String wi:allWindowIds) {
			 driver.switchTo().window(wi);
			 Thread.sleep(2000);
			 String actualUrl=driver.getCurrentUrl();
			 
			 if(actualUrl.equals(expectedUrl))
			 {
				 break;
			 }
			 }
		 driver.close();
		 Thread.sleep(2000);
		 driver.quit();
		}

}
