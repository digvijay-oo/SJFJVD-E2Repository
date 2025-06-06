package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(3000);
		
		WebElement clickAndHoldElement = driver.findElement(By.xpath("//div[@id='circle']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(clickAndHoldElement).perform();
		Thread.sleep(3000);
		
		act.moveToElement(clickAndHoldElement).release().perform();
		
	}
}
