package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		String perentWindowHandle = driver.getWindowHandle();// To Get  Adress/sESSION ID / Handle Id
		System.out.println(perentWindowHandle);
		Thread.sleep(5000);
		driver.close();
	}
}
