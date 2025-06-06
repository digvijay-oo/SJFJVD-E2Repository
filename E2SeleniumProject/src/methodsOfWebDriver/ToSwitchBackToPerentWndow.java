package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToPerentWndow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(2000);
		// Capturing Window ID
		String perentWindwHandle=driver.getWindowHandle();
		
		//Opening New Tab 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.formula1.com/");
		Thread.sleep(2000);
		
		//Opening new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.wwe.com/");
		Thread.sleep(3000);
		
		//Switching to main Window By using 
		driver.switchTo().window(perentWindwHandle);
		Thread.sleep(2000);
		driver.close();
		
	}
}
