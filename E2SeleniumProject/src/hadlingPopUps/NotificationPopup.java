package hadlingPopUps;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopup {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--dissable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    
	    driver.get("https://easemytrip.com/");
	    
	    
	    
	}
}
