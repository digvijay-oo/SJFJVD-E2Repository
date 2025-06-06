package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPositionOfWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		Point point = driver.manage().window().getPosition();
		
		int xaxis= point.getX();
		int yaxis=point.getY();
		
		System.out.println("X-Axis is  :"+xaxis+"  Y-Axis is  :"+yaxis);
		Thread.sleep(3000);
		
		Point targetPoint= new Point(250,180);
		
		driver.manage().window().setPosition(targetPoint);
	}
}
