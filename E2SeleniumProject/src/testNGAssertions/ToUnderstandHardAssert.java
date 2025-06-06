package testNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssert {
  @Test
  public void verifyUsingHardAssert() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  String expectedTitleOfElectronicsPage="Demo Web Shop. Electronics";
	  
	  driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	  
	  String actualTitleOfElectronicsPage=driver.getTitle();
	  
//	  if(actualTitleOfElectronicsPage.equals(expectedTitleOfElectronicsPage));
//	  {
//		  System.out.println("Electronics Page Is Displayed");
//	  }
//	  else 
//	  {
//		  System.out.println("Electronics Page Is Not Displayed");
//	  }
	  
	  	Assert.assertEquals(driver.getTitle(), expectedTitleOfElectronicsPage, "Electronics Page Is Not Displayed");
	  	driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	  	
	  	String expetedCellPhonesPageTitle="Demo Web Shop. Cell phones";
	  	
	  	Assert.assertEquals(driver.getTitle(), expetedCellPhonesPageTitle, "Cell Phone Page is Not Displayed");
	  
	  
  }
}
