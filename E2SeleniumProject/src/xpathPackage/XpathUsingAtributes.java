package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAtributes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    driver.findElement(By.linkText("Log in")).click();
	    
	   WebElement emailTB = driver.findElement(By.xpath("//input[@id='Email']"));
	   emailTB.sendKeys("digvijay@gmail.com");
	   
	   WebElement passwordTB = driver.findElement(By.xpath("//input[@type='password']"));
	   passwordTB.sendKeys("987654321");
	   
	   WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
	   loginButton.click();
	}

}
