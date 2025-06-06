package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("ELECTRONICS")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']/../../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		
		WebElement cartProduct = driver.findElement(By.xpath("//td[@class='product-picture']"));
		
		if(cartProduct.isDisplayed()) {
			System.out.println("Product is Added to the Cart");
		}
		else {
			System.out.println("Product is Not Added to the Cart");
		}
	}
}
