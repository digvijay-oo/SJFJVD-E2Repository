package hadlingPopUps;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalendarPopups {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime dateAndTime=LocalDateTime.now();
		
		Month month = dateAndTime.getMonth();
		String newMonth = month.toString();
		String actualMonth = newMonth.charAt(0)+newMonth.substring(1).toLowerCase();
		
		int day = dateAndTime.getDayOfMonth();
		
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    
	    driver.get("https://www.redbus.com/");
	    
	    driver.findElement(By.id("date-box")).click();
	    
//	    driver.findElement(By.xpath("//div[text()='April']/../..//span[text()='24']")).click();
	    
	    driver.findElement(By.xpath("//div[text()='"+actualMonth+"']/../..//span[text()='"+day+"']")).click();
	    
	    
	}
}
