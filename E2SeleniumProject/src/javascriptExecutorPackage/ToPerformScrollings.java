package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(400,1000)");
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(-150,300)");
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(0,-650)");
		Thread.sleep(1000);
	}
}
