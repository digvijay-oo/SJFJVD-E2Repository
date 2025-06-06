package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTabsAndWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/virat.kohli/#");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.royalenfield.com/in/en/home/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zomato.com/");
	}
}
