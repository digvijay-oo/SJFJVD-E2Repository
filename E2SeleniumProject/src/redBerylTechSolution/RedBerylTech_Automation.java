package redBerylTechSolution;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBerylTech_Automation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		
		
		
		driver.get("https://www.redberyltech.com/");
		driver.findElement(By.linkText("Contact Us")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Jay");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("jay@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your Phone Number']")).sendKeys("9876543210");
		WebElement dropD = driver.findElement(By.xpath("//div[@class='css-13cymwt-control']"));
		act.scrollToElement(dropD).moveToElement(dropD).click().perform();
//		WebElement opt5 = driver.findElement(By.xpath("//input[@aria-activedescendant='rect-select-2-option-5']"));
//		act.moveToElement(opt5).click();
		
		driver.findElement(By.xpath("//textarea[@id='formMessage']")).sendKeys("Testing");
		

		WebElement sendButton = driver.findElement(By.xpath("//button[text()='Send Message']"));
		
		act.moveToElement(sendButton).click().perform();
		
     	driver.findElement(By.xpath("//p[text()='507-B,']")).click();
     	driver.navigate().back();
     	
       driver.findElement(By.xpath("(//a[@href='https://www.facebook.com/RedberylTech'])[2]")).click();

       driver.findElement(By.xpath("((//a[@href='https://www.instagram.com/info.redberyl.tech/'])[2]")).click();
       driver.findElement(By.xpath("(//a[@href='https://x.com/RedberylTech'])[2]")).click();
       
       driver.findElement(By.xpath("(//a[@href=https://www.linkedin.com/in/redberyl-tech-solutions/'])[2]")).click();
       
       driver.findElement(By.xpath("//p[text()='info@redberyltech.com']")).click();
       
       driver.findElement(By.xpath("//p[text()='+91 76669 87829']")).click();
		Thread.sleep(1000);
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		driver.findElement(By.xpath("//p[text()='+91 20472 27424']")).click();
		Alert alt1= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
       
		
		
		
	}
	

}
