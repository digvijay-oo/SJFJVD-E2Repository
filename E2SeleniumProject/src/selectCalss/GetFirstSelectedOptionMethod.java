package selectCalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		
		Select sel=new Select(dropdown);
		Thread.sleep(500);
		
		sel.selectByIndex(2);
		Thread.sleep(500);
		
		sel.selectByValue("swiftx");
		Thread.sleep(500);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(500);
		
		WebElement firstOpt=sel.getFirstSelectedOption();
		String text=firstOpt.getText();
		
		System.out.println(text);
	}
}
