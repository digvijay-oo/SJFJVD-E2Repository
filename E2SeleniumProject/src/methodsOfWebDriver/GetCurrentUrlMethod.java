package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(5000);
		driver.close();
	}
}
