package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTB = driver.findElement(By.id("email"));
		Dimension size = emailTB.getSize();
		
		int height=size.getHeight();
		int width=size.getWidth();
		
		System.out.println("Width of Email Text Box is :"+width+"Heigth of Email Text Box is :"+height);
	}
}
