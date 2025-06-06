package xpathPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAndLogicalOperator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		 driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		    
		    driver.findElement(By.xpath("//a[contains(@title,'Brilliant Green, 128 GB')]")).click();
		    Thread.sleep(2000); 
		    driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		    
		    driver.findElement(By.xpath("//a[contains(@title,'Brilliant Green, 128 GB') and contains(@class,'wjcEIp')]")).click();
		
	}
}

//a[contains(@title,'Brilliant Green, 128 GB') and contains(@class,'wjcEIp')]