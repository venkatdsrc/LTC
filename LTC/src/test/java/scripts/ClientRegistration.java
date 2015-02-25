package test.java.scripts;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;

import test.java.utils.BaseTest;

public class ClientRegistration extends BaseTest {
	
	//public WebDriver driver;
	
   @Test(groups ={"Regression"})
   public void addClient() throws Exception {
 	  
	  try {
		System.out.println("Inside addClient() test method");
		  Thread.sleep(2000);
		  String currURL = driver.getCurrentUrl();
		  String currPageTitle = driver.getTitle();
		  String currWinHandle = driver.getWindowHandle();
		  
		 driver.findElement(By.id("ctl00_lnkLogin")).click();
		 driver.findElement(By.id("ctl00_ContentMainHolder_txtUserName")).sendKeys("veenu.s@dsrc.co.in");
		 driver.findElement(By.id("ctl00_ContentMainHolder_txtPassword")).sendKeys("dsrc12345");
		 driver.findElement(By.name("ctl00$ContentMainHolder$btnLogin")).click();
 		 driver.findElement(By.id("ctl00_ContentMainHolder_btnAcceptPrivacyPolicy")).click();
/*		 
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
*/		 
		 Thread.sleep(6000);
		 if (true) {
			 Assert.assertTrue(true);
		 }
	
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
   }
   /*
   @Test(groups ={"Smoke"})
   public void viewClient() throws Exception {
 	  
	  try {
		  System.out.println("Inside viewClient() test method..");
		 Thread.sleep(6000);
		 if (true) {
			 Assert.assertTrue(false);
		 }
	
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
   }
*/
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  	System.out.println("Inside afterMethod");
	  	Thread.sleep(1500);
	  	//driver.quit();
	 
  }

}
