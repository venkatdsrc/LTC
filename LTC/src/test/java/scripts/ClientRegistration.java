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


public class ClientRegistration extends BaseTest {
	
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

@Test(groups={"Regression"},dependsOnMethods = {"setUp1"}) 

public void setUp2 () {
	System.out.println("Set up2..");
}

@Test (groups ={"Regression"})
public void setUp1() {
	System.out.println("Set up1..");
}


@Test(groups ={"Regression"})
   public void addClient() throws Exception {
 	  
	  try {
		  System.out.println("Inside addClient method-tag added-for Veenu-30/7/15");
		  Thread.sleep(2000);
		  String currURL = driver.getCurrentUrl();
		  String currPageTitle = driver.getTitle();
		  String currWinHandle = driver.getWindowHandle();
		  System.out.println("Current URL : " + currURL + " "+ "Current Page Title : "+currPageTitle+" " + "Current Window Handle : " + currWinHandle);
		  
		  
		  //
			 //
		  
		  LoginPage objLoginPage = new LoginPage(driver);
		  //test@test.com
		  //dsrc1234
		  objLoginPage.loginToLTC("test@test.com", "dsrc1234");
		  
		 
 		 
 
		 WebElement el = driver.findElement(By.partialLinkText("Client Processin")); 
		 Actions builder = new Actions(driver); 
		 builder.moveToElement(el).perform();
		 WebElement e2 = driver.findElement(By.partialLinkText("Report"));
		 builder.moveToElement(e2).perform();
		 WebElement e3 = driver.findElement(By.partialLinkText("Current 9401 Detailed Aging Repo")); 
		 builder.moveToElement(e3).perform();
		 File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scr1, new File("d:\\venkat\\scr.png"));
		 Reporter.log("Screenshot taken");
		 Thread.sleep(6000);
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
		  System.out.println("Inside viewClient() test method..29/7");
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
