package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(1000);
	}
}
