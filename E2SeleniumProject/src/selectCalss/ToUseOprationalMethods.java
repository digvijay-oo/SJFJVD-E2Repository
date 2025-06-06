package selectCalss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseOprationalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/OneDrive/Desktop/QSpiders/WebElements/dropdown.html");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.name("Companies2"));
		
		Select sel=new Select(dropdown);
		
		sel.selectByVisibleText("Google");
		Thread.sleep(2000);
		
		sel.selectByValue("google");
		Thread.sleep(2000);
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		boolean result=sel.isMultiple();
		if(result) {
			System.out.println("This dropdown is MultiSelect Dropdown");
		}
		else {
			System.out.println("This dropdown is Single Select Dropdown");
		}
		WebElement firstSelOpt=sel.getFirstSelectedOption();
		String firstOptText =  firstSelOpt.getText();
		System.out.println("First Selected Option is: "+firstOptText);
		
		System.out.println("-------All Selected Options Are------");
		List<WebElement> allSelOps = sel.getAllSelectedOptions();
		for(WebElement we: allSelOps) {
			System.out.println(we.getText());
		}
		List<WebElement> allOps =sel.getOptions();
		allOps.removeAll(allSelOps);
		
		System.out.println("-------------Non Selected Options Are--------------");
		for(WebElement we: allOps) {
			System.out.println(we.getText());
		}
	}
}
