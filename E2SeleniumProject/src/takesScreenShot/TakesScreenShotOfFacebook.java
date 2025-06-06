package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShotOfFacebook {

	public static void main(String[] args) throws IOException {
		
		String dateAndTime = LocalDateTime.now().toString();
		String date = dateAndTime.replaceAll(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/facebook"+date+".png");
		
	    FileHandler.copy(src, dest);
		
	}
}
