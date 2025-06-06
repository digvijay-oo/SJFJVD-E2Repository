package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysMethodOfActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);

		WebElement emailTB = driver.findElement(By.id("Email"));

		WebElement passwordTB = driver.findElement(By.id("Password"));

		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(emailTB).sendKeys("digvijay@gmail.com").perform();
		Thread.sleep(500);
		
		act.sendKeys(passwordTB, "Digvijay").perform();
		
		act.click(loginButton).perform();
	}
}
