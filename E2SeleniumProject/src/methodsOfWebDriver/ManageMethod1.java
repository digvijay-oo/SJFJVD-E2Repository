package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
//		Options ops=driver.manage();
//		Window wi=ops.window();
//		wi.maximize();
		
		driver.manage().window().maximize();// To maximize te browser window
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
	//	driver.get("https://www.selenium.dev/");
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}
}
