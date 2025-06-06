package actionsClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageInNewTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);

		String expectedTitle = "Demo Web Shop. Login";

		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		String parentWindow = driver.getWindowHandle();

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).click(loginLink).perform();
		Thread.sleep(1000);
		act.keyUp(Keys.CONTROL).perform();

		Set<String> allWindows = driver.getWindowHandles();

		allWindows.remove(parentWindow);

		for (String wi : allWindows) {
			driver.switchTo().window(wi);
			
			String actualTitle=driver.getTitle();

			if (actualTitle.equals(expectedTitle)) {

				break;
			}
		}
		  driver.findElement(By.id("Email")).sendKeys("digvijay@gmail.com");
		
	}
}
