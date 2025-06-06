package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class TakingScreenshotOfWebElement {


public static void main(String[] args) throws IOException {
		
		String dateAndTime = LocalDateTime.now().toString();
		String timeStamp = dateAndTime.replaceAll(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		
		
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/fbloginbutton"+timeStamp+".png");
		
	    Files.copy(src, dest);
		
	}
}
