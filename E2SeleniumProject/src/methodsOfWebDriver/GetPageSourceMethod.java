package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(5000);
		driver.close();
	}
}
