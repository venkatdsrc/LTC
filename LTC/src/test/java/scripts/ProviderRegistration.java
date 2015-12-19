package test.java.scripts;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;
import main.java.pages.LoginPage;

import test.java.utils.BaseTest;


public class ProviderRegistration extends BaseTest {
	
	//public WebDriver driver;
	
@BeforeSuite 
public void befSuite() {
	System.out.println("Before suite..");
	
}

@AfterSuite
public void aftSuite() {
	System.out.println("After suite..");
	
}

@BeforeGroups
public void testGroups() {
	System.out.println("Before group..");
	
}

@AfterGroups
public void testAftGroups() {
	System.out.println("After group..");
	
}

/*
@Test(groups={"Regression"},dependsOnMethods = {"setUp1"}) 
public void setUp2 () {
	System.out.println("Set up2..");
}

@Test (groups ={"Regression"})
public void setUp1() {
	System.out.println("Set up1..");
}
*/

@Test(groups ={"Regression"})
   public void addProvider() throws Exception {
 	  
	  try {
		  System.out.println("Inside addProvider method - 19/12/1 at 617pm");
		  Thread.sleep(2000);
		  String currURL = driver.getCurrentUrl();
		  String currPageTitle = driver.getTitle();
		  String currWinHandle = driver.getWindowHandle();
		  System.out.println("Current URL : " + currURL + " "+ "Current Page Title : "+currPageTitle+" " + "Current Window Handle : " + currWinHandle);
		  
		  LoginPage objLoginPage = new LoginPage(driver);
		  objLoginPage.loginToLTC("premnath@dsrc.co.in", "dsrc1234");
		  WebElement el = driver.findElement(By.partialLinkText("Account Mgmt")); 
		  Actions builder = new Actions(driver); 
		  builder.moveToElement(el).perform();
		  Thread.sleep(2000);
		  
		  WebElement e2 = driver.findElement(By.partialLinkText("Provider Registration"));
		  builder.moveToElement(e2).click().perform();
		  Thread.sleep(4000);
		  WebElement addProviderElement = driver.findElement(By.id("ctl00_ContentMainHolder_btnAddProvider"));
		  
		  addProviderElement.click();
		  Thread.sleep(4000);
		  WebElement txtProviderName = driver.findElement(By.id("ctl00_ContentMainHolder_ucProviderInformation_txtProviderName"));
		  txtProviderName.sendKeys("Provider1");
		  WebElement txtProviderEINPart1 = driver.findElement(By.id("ctl00_ContentMainHolder_ucProviderInformation_txtEIN2"));
		  txtProviderEINPart1.sendKeys("12");
		  WebElement txtProviderEINPart2 = driver.findElement(By.id("ctl00_ContentMainHolder_ucProviderInformation_txtEIN7"));
		  txtProviderEINPart2.sendKeys("1234567");
		 
		  /*
		  
		  WebElement inputProviderType = driver.findElement(By.id("ctl00_ContentMainHolder_ucProviderInformation_txtProviderType"));
		  inputProviderType.click();
		  Thread.sleep(2000);
		  WebElement selectProviderType = driver.findElement(By.id("ctl00_ContentMainHolder_ucProviderInformation_chkboxlstProviderType"));
		  Select objProviderTypeSelect = new Select(selectProviderType);
		  System.out.println("Is multi select allowed? : " + objProviderTypeSelect.isMultiple());
		  objProviderTypeSelect.selectByIndex(1);
		  objProviderTypeSelect.selectByIndex(2);
		  Thread.sleep(4000);
		  WebElement locationInformationSection = driver.findElement(By.id("ctl00_ContentMainHolder_pnlHeaderLocationInfo"));
		  locationInformationSection.click();
		  Thread.sleep(4000);
		  WebElement locationName = driver.findElement(By.id("ctl00_ContentMainHolder_ucLocationInformation_txtLocationName"));
		  locationName.sendKeys("Location1");
		  Thread.sleep(2000);
			
		  WebElement locationAddress1 = driver.findElement(By.id("ctl00_ContentMainHolder_ucLocationInformation_txtAddress"));
		  locationAddress1.sendKeys("1st Street");
		  Thread.sleep(2000);
			
		  WebElement locationCity = driver.findElement(By.id("ctl00_ContentMainHolder_ucLocationInformation_txtCity"));
		  locationCity.sendKeys("City1");
		  Thread.sleep(2000);
			
		  WebElement locationStateDropDown = driver.findElement(By.name("ctl00$ContentMainHolder$ucLocationInformation$ddlState"));
		  Select objSelect = new Select(locationStateDropDown);
		  objSelect.selectByVisibleText("Ohio");
		  Thread.sleep(2000);
			
		  WebElement locationZipCode1 = driver.findElement(By.id("ctl00_ContentMainHolder_ucLocationInformation_txtZipCode"));
		  locationZipCode1.sendKeys("12345");
		  Thread.sleep(2000);
			
		  WebElement locationZipCode2 = driver.findElement(By.id("ctl00_ContentMainHolder_ucLocationInformation_txtZipCodeplus"));
		  locationZipCode2.sendKeys("6789");
		  Thread.sleep(2000);
			
		  
		//  WebElement specialityAreaSection = driver.findElement(By.id("ctl00_ContentMainHolder_ImgSpecAreaExpand"));
		  
		//  specialityAreaSection.click();
		 // Thread.sleep(4000);
	//	  WebElement headerContactInfo = driver.findElement(By.id("ctl00_ContentMainHolder_pnlHeaderContactInfo"));
		//  headerContactInfo.click();
		  
		  
		  
		 // ctl00_ContentMainHolder_ucProviderInformation_txtDescription
		  */
		  Thread.sleep(2000);
		  this.takeScreenShot("ProviderRegistration");
		  Reporter.log("Screenshot taken");
		  //ctl00_ContentMainHolder_lblMessage
	
		  if (true) {
			 Assert.assertTrue(true);
		  }
	
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
   }
   @Test(groups ={"Smoke"})
   public void viewClient() throws Exception {
 	  
	  try {
		 System.out.println("Inside viewClient() test method..19/12");
		 Thread.sleep(6000);
		 if (true) {
			 Assert.assertTrue(false);
		 }
	
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
   }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  	System.out.println("Inside afterMethod");
	  	Thread.sleep(1500);
	  	//driver.quit();
	 
  }

}
