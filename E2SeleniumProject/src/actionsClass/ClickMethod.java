package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		WebElement uploadFileButton = driver.findElement(By.id("uploadfile"));
		// Trying to click on the WebElement by Using click() of WebElment Interface
		// Not working

		// Solution Use Actions Class click()/click(WebElement target) Method

		Actions act = new Actions(driver);

		// act.moveToElement(uploadFileButton).click().perform();

		act.click(uploadFileButton).perform();

	}
}
