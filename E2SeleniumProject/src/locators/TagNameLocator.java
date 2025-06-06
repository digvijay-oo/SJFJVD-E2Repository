package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/OneDrive/Desktop/QSpiders/WebElements/TextBox_1.html");
		driver.findElement(By.tagName("input")).sendKeys("12345678");
	}

}
// it put in first input object  // we have to put password but it is inserting inside Username