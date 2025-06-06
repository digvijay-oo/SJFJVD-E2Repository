package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		Navigation nav = driver.navigate();
		nav.to("https://www.dream11.com/");
		Thread.sleep(3000);
		
		nav.back();
		Thread.sleep(3000);
		
		nav.back();
		Thread.sleep(3000);
		
		nav.forward();
		Thread.sleep(3000);
		
		nav.forward();
		Thread.sleep(3000);
		
		nav.refresh();
		Thread.sleep(3000);
		
		driver.close();
	}
}
