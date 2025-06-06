package demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUnderstandRTP {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser Name");
		String browserValue=sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Enter Valid Browser Name");
		}
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
