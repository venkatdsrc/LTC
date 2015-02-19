package test.java.utils;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LTCWrapper {

	public WebDriver driver;
	public String sFinalPath, sTestName, strResult;
	WebDriverWait wait = null;
	//String sAbsPath = 	System.getProperty("user.dir")+"\\";
	String sAbsPath = 	System.getProperty("user.dir");
	
	public LTCWrapper(WebDriver driver) {
		System.out.println("Inside SEWrapper() default constructor..");
		this.driver = driver;
		wait = new WebDriverWait (driver, 10000);
		  

	}
	
	public LTCWrapper(WebDriver driver, String strPath) {
	
		this.driver = driver;
		//sFinalPath = sAbsPath + "screenshots\\" + strPath + "\\" ;
	   DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
	   Date date = new Date();
       String today = dateFormat.format(date);
       sFinalPath = sAbsPath + "/screenshots/" + strPath + "/" + today + "/" ;
		
		System.out.println("Final path : " + sFinalPath);
		File file = new File(sFinalPath);
	
		if (!file.exists()) {
			file.mkdir();
		}
		
		
		
	}
	
	
		
	public void takeScreenShot(String strTest) {
	
		
		try {
			File file = new File(sFinalPath + strTest + ".png");
			System.out.println("File path : " + sFinalPath + "File id : " + file);
			Thread.sleep(4000);
			File tmpFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(tmpFile, file);
		} catch (IOException ioe ) {
			ioe.printStackTrace();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}


}
