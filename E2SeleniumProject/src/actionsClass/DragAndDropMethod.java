package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);

		WebElement osloCapital = driver.findElement(By.id("box1"));

		WebElement norwayOsloTarget = driver.findElement(By.id("box101"));

		Actions act = new Actions(driver);

		act.dragAndDrop(osloCapital, norwayOsloTarget);

		WebElement  stockholmSource= driver.findElement(By.id("box2"));
		WebElement swedenTarget = driver.findElement(By.id("box102"));
		
		act.dragAndDrop(stockholmSource, swedenTarget).perform();
		
		
		WebElement  washingtonSource= driver.findElement(By.id("box3"));
		WebElement usaTarget = driver.findElement(By.id("box103"));
		
		act.dragAndDrop(washingtonSource, usaTarget).perform();
		
		
		
		WebElement  copenhagenSource= driver.findElement(By.id("box4"));
		WebElement denmarkTarget = driver.findElement(By.id("box104"));
		
		act.dragAndDrop(copenhagenSource, denmarkTarget).perform();
		
		
		
		WebElement  seoulSource= driver.findElement(By.id("box5"));
		WebElement southKoreaTarget = driver.findElement(By.id("box105"));
		
		act.dragAndDrop(seoulSource, southKoreaTarget).perform();
		
		
		
		WebElement  romeSource= driver.findElement(By.id("box6"));
		WebElement italyTarget = driver.findElement(By.id("box106"));
		
		act.dragAndDrop(romeSource, italyTarget).perform();
		
		
		
		WebElement  madridSource= driver.findElement(By.id("box7"));
		WebElement spainTarget = driver.findElement(By.id("box107"));
		
		act.dragAndDrop(madridSource, spainTarget).perform();

	}
}
