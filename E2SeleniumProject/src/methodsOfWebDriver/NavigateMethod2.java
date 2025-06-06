package methodsOfWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod2 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/"); //TO LAUNCH
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/"); // to launch
		Thread.sleep(1000);
		
		//to launch
		Navigation nav = driver.navigate();
//		URL url = new URL("https://www.dream11.com/");// creating the object of URL class and pass url of application
//		nav.to(url); // pass ref of URL class as an argument
		
		nav.to(new URL("https://www.dream11.com/")); // creating object of URl class inside to() and pass url 
//		nav.to("https://www.dream11.com/");
		Thread.sleep(1000);
		
		nav.back();
		Thread.sleep(1000);
		
		nav.back();
		Thread.sleep(1000);
		
		nav.forward();
		Thread.sleep(1000);
		
		nav.forward();
		Thread.sleep(1000);
		
		nav.refresh();
		Thread.sleep(1000);
		
		driver.close();
	}
}
