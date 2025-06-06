package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.cadbury.co.uk/");
	 Thread.sleep(1000);
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get("https://www.nestle.in/");
	 Thread.sleep(2000);
	 
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://cococart.in/");
	 Thread.sleep(1000);
	 
	 Set<String> allWindowIds = driver.getWindowHandles();
	 
	 for(String wi:allWindowIds) {
		 System.out.println(wi);
		 Thread.sleep(2000);
	 }
	}
}
