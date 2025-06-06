package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Dimension size = driver.manage().window().getSize();
		
		int height=size.getHeight();
		int width= size.getWidth();
		// System.out.println("Height is :"+height+"  Width is :"+width);
		
		
		Dimension targetSize = new Dimension(800,500);
		driver.manage().window().setSize(targetSize);
		
		Thread.sleep(3000);
		driver.close();
		
		System.out.println("Dimensions we get");
		System.out.println("Height is :"+height+"  Width is :"+width);
	}
}
