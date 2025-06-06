package hadlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	
		
		String parentWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(1000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		String preUrl="https://the-internet.herokuapp.com/windows/new";
		
		for(String wi : allWindowIds) {
			driver.switchTo().window(wi);
			if(driver.getCurrentUrl().equals(preUrl)) {
				String text=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		    System.out.println(text);
		    break;
			}
		}
	}
}
