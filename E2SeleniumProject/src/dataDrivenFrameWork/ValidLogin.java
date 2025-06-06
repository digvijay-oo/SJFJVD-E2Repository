package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		// Creating the object of  Flib class to access the method to read data from Excel File
		
		Flib flib= new Flib();
		
		// To Read Email(Data) from Excel File
		String email= flib.readExcelData("./data/TestData.xlsx", "validcreds", 1, 0);
		
		//To Read Password from Excel File
		String password= flib.readExcelData("./data/TestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
