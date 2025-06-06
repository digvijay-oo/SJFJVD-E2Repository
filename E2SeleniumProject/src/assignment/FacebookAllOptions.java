package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAllOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		WebElement dateDropDown = driver.findElement(By.id("day"));

		WebElement monthDropDown = driver.findElement(By.id("month"));

		WebElement yearDropDown = driver.findElement(By.id("year"));

		Select select = null;

		select = new Select(monthDropDown);
		List<WebElement> monthOptions = select.getOptions();
		for (WebElement x : monthOptions) {
			String value = x.getAttribute("value");
			select.selectByValue(value);
			Thread.sleep(1000);
		}

		select = new Select(dateDropDown);

		if (select.isMultiple())
			System.out.println("date dropdown is a multi select dropdown");
		else
			System.out.println("date dropdown is a single select dropdown");
		List<WebElement> dateOptions = select.getOptions();
		int i = 0;
		for (WebElement x : dateOptions) {
			select.selectByIndex(i);
			Thread.sleep(500);
			i++;
		}
		select = new Select(yearDropDown);
		List<WebElement> yearOptions = select.getOptions();
		for (WebElement x : yearOptions) {
			String text = x.getText();
			select.selectByVisibleText(text);
			Thread.sleep(250);
		}

	}

}
