package hadlingPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    
	    driver.get("http://omayo.blogspot.com/");
	    
	    driver.findElement(By.id("prompt")).click();
	    
	    Alert promptAlert = driver.switchTo().alert();
	    
	    System.out.println(promptAlert.getText());
	    Thread.sleep(1000);
	    
	    promptAlert.sendKeys("digvijay");
	    Thread.sleep(1000);
	    
	    promptAlert.accept();
	}
}
