package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
        //To create the object of chromeDriver and UpCast into WebDriver
		WebDriver driver=new ChromeDriver();
		
		// to launch the web Application
		driver.get("https://www.zomato.com/");
        Thread.sleep(10000);
        driver.close();

	}

}
