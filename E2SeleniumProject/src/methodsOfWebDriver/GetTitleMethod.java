package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String title=driver.getTitle();
		System.out.println(title);
	}
}
