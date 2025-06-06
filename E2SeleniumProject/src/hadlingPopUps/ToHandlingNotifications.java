package hadlingPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlingNotifications {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    
	    driver.get("https://easemytrip.com/");
	    Thread.sleep(3000);
	    
	    // we have to relese every key that we press using robot class
	    Robot robot=new Robot();
	    
	    robot.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(500);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(500);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(500);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	}
}
