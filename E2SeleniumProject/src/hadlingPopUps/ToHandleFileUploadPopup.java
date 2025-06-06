package hadlingPopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    
	    driver.get("http://omayo.blogspot.com/");
	    Thread.sleep(1000);
	    
	    WebElement fileUploadButon = driver.findElement(By.id("uploadfile"));
	    
	    Actions act= new Actions(driver);
	    act.click(fileUploadButon).perform();
	    
	    Runtime.getRuntime().exec("./autoItPrograms/FileUpload.exe");
	    
	    
	    
	}
}
