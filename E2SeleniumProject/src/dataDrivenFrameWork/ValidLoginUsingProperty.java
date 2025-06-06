package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginUsingProperty extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Flib flib=new Flib();
		String email = flib.readPropertyData(PROP_PATH, "email");
		String password = flib.readPropertyData(PROP_PATH, "password");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
}
