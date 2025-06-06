package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
	
		
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(2000);
		
		WebElement target1 = driver.findElement(By.id("btn30"));
		WebElement target2 = driver.findElement(By.id("btn31"));
		WebElement target3 = driver.findElement(By.id("btn32"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(target1).contextClick().perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(2000);
		WebElement msg1=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(msg1.getText());
		
		act.contextClick(target2).perform();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		Thread.sleep(2000);
		WebElement msg2=driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		System.out.println(msg2.getText());
		
		act.contextClick(target3).perform();
		driver.findElement(By.xpath("//div[text()='5']")).click();
		WebElement msg3=driver.findElement(By.xpath("//span[text()='You selected \"5\"']"));
		System.out.println(msg3.getText());
		
	}
}
