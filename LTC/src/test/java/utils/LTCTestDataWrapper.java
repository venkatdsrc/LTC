package test.java.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LTCTestDataWrapper {

	

	public String sFinalPath;
	public static int rowCntInUpdContactDetails;
	public static int colCntInUpdContactDetails;
	public static int rowCntInSearchAndRefine;
	public static int colCntInSearchAndRefine;
	public static int rowCntInManageSavedSales;
	public static int colCntInManageSavedSales;
	public static int rowCntInChangePwd;
	public static int colCntInChangePwd;
	public static int rowCntInInspireMe;
	public static int colCntInInspireMe;
	public static int rowCntInLastMinuteSearch;
	public static int colCntInLastMinuteSearch;
	public static int rowCntInBookingCalendar;
	public static int colCntInBookingCalendar;
	public static int rowCntInOfferSelection;
	public static int colCntInOfferSelection;
	public static int rowCntInPaymentInfo;
	public static int colCntInPaymentInfo;
	public static int rowCntInPassengerInfo;
	public static int colCntInPassengerInfo;
	public static int rowCntInDiffContactInfo;
	public static int colCntInDiffContactInfo;
	public static int rowCntInDiffBillingContactInfo;
	public static int colCntInDiffBillingContactInfo;
	
	
	
	//String sAbsPath = 	System.getProperty("user.dir")+"\\";
	String sAbsPath = 	System.getProperty("user.dir");
	public LTCTestDataWrapper() {
		
		System.out.println("Test data path is updated: " + sAbsPath);
	}
	
	
	
	public String[][] readTestDataForChooseTerritory(String strSheetName) {
		String cellData[][] = null;
			 
			try {
				//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
				   sFinalPath = sAbsPath + "/data/testdata.xls";
					File readExcel = new File (sFinalPath);
					System.out.println("Test data path for choosing territory : " + readExcel);
					
		    FileInputStream fis = new FileInputStream(readExcel);
		    HSSFWorkbook wb = new HSSFWorkbook(fis);
		    HSSFSheet ws = wb.getSheet(strSheetName);
		    HSSFRow row;
		    HSSFCell cell;
		    int rowNum = ws.getLastRowNum()+1;
		    int colNum = ws.getRow(0).getLastCellNum();
		    
		    cellData = new String[rowNum][colNum];
		    System.out.println("Rows " + rowNum + " " + "Columns" + colNum);
		    for(int i=1; i<rowNum; i++){
		        row = ws.getRow(i);
		        if(row != null){
		            for(int j=0;j<colNum;j++){
		                cell = row.getCell(j);
		                if(cell != null){
		                    try{
		                        cellData[i][j] = cell.getStringCellValue();
		                    }catch(IllegalStateException e){
		                        System.out.println("Cell data is not a string(text) - login details");
		                    }
		                }
		            }
		        }
		    }
		   
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			 return cellData;
				
			}
					

	public String readTestDataForEmailRegistraion(String strSheetName) {
		
		String value=null;
		try {
		
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for registration details : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    int rowNum = ws.getLastRowNum()+1;
	    int colNum = ws.getRow(0).getLastCellNum();
	    String[][] data = new String[rowNum][colNum];
	    for (int i=1; i<rowNum; i++){
	        HSSFRow row = ws.getRow(i);
	            for (int j=0; j<colNum; j++){
	                HSSFCell cell = row.getCell(j);
	                value = cell.getStringCellValue();
	                //data[i][j] = value;
	                System.out.println("The value is : " + value);
	                break;	
	            }
	       }
	    
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
			return value;
			
		}
			
	
	public String[][] readTestDataForFBLogin(String strSheetName) {
		String cellData[][] = null;
			 
			Hashtable table = new Hashtable();
			try {
				//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
				   sFinalPath = sAbsPath + "/data/testdata.xls";
					File readExcel = new File (sFinalPath);
					System.out.println("Test data path for fb details : " + readExcel);
					
		    FileInputStream fis = new FileInputStream(readExcel);
		    HSSFWorkbook wb = new HSSFWorkbook(fis);
		    HSSFSheet ws = wb.getSheet(strSheetName);
		    HSSFRow row;
		    HSSFCell cell;
		    int rowNum = ws.getLastRowNum()+1;
		    int colNum = ws.getRow(0).getLastCellNum();
		    cellData = new String[rowNum][colNum];
		    System.out.println("Rows " + rowNum + " " + "Columns" + colNum);
		    for(int i=1; i<rowNum; i++){
		        row = ws.getRow(i);
		        if(row != null){
		            for(int j=0;j<colNum;j++){
		                cell = row.getCell(j);
		                if(cell != null){
		                    try{
		                        cellData[i][j] = cell.getStringCellValue();
		                    }catch(IllegalStateException e){
		                        System.out.println("Cell data is not a string(text) - login details");
		                    }
		                }
		            }
		        }
		    }
		   
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			 return cellData;
				
			}
					


public String[][] readTestDataForLogin(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
		
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for login details : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    int rowNum = ws.getLastRowNum()+1;
	    int colNum = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowNum][colNum];
	    System.out.println("Rows " + rowNum + " " + "Columns" + colNum);
	    for(int i=1; i<rowNum; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colNum;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData[i][j] = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                        System.out.println("Cell data is not a string(text) - login details");
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		 return cellData;
			
		}
				

public String[][] readTestDataForUpdatingContactDetails(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
		   sFinalPath = sAbsPath + "/data/testdata.xls";
			File readExcel = new File (sFinalPath);
			System.out.println("Test data path for updating contact details : " + readExcel);
		
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInUpdContactDetails = ws.getLastRowNum()+1;
	    colCntInUpdContactDetails = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInUpdContactDetails][colCntInUpdContactDetails];
	    System.out.println("Rows " + rowCntInUpdContactDetails + " " + "Columns" + colCntInUpdContactDetails);
	    for(int i=1; i<rowCntInUpdContactDetails; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInUpdContactDetails;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData[i][j] = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                        System.out.println("Cell data is not a string(text) - update contact details");
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}

public String[][] readTestDataForSearchAndRefine (String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for search and refine: " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInSearchAndRefine = ws.getLastRowNum()+1;
	    colCntInSearchAndRefine = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInSearchAndRefine][colCntInSearchAndRefine];
	    System.out.println("Rows " + rowCntInSearchAndRefine + " " + "Columns" + colCntInSearchAndRefine);
	    for(int i=1; i<rowCntInSearchAndRefine; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInSearchAndRefine;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData[i][j] = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                        System.out.println("Cell data is not a string(text) - update contact details");
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}
	



public String readTestDataForManageSavedSales(String strSheetName) {
	String cellData = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for manage saved: " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInManageSavedSales = ws.getLastRowNum()+1;
	    colCntInManageSavedSales = ws.getRow(0).getLastCellNum();
	    //cellData = new String[rowCntInSearchAndRefine][colCntInSearchAndRefine];
	    System.out.println("Rows " + rowCntInManageSavedSales + " " + "Columns" + colCntInManageSavedSales);
	    for(int i=0; i<rowCntInManageSavedSales; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInManageSavedSales;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                        System.out.println("Cell data is not a string(text) - update contact details");
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}
	

public String[][] readTestDataForChangePassword(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for change pwd: " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInChangePwd = ws.getLastRowNum()+1;
	    colCntInChangePwd = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInChangePwd][colCntInChangePwd];
	    System.out.println("Rows " + rowCntInChangePwd + " " + "Columns" + colCntInChangePwd);
	    for(int i=1; i<rowCntInChangePwd; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInChangePwd;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData[i][j] = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                       e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
	}


public String[][] readTestDataForViewInspireMeList(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for inspire me: " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInInspireMe = ws.getLastRowNum()+1;
	    colCntInInspireMe = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInInspireMe][colCntInInspireMe];
	    System.out.println("Rows " + rowCntInInspireMe + " " + "Columns" + colCntInInspireMe);
	    for(int i=1; i<rowCntInInspireMe; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInInspireMe;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData[i][j] = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                       e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
	}



public String[][] readTestDataForLastMinuteSearch(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for last minute search : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInLastMinuteSearch = ws.getLastRowNum()+1;
	    colCntInLastMinuteSearch = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInLastMinuteSearch][colCntInLastMinuteSearch];
	    System.out.println("Rows " + rowCntInLastMinuteSearch + " " + "Columns" + colCntInLastMinuteSearch);
	    for(int i=0; i<rowCntInLastMinuteSearch; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInLastMinuteSearch;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                        cellData[i][j] = cell.getStringCellValue();
	                    }catch(IllegalStateException e){
	                       e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
	}


public String[][] readTestDataForBookingDateSelection(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for booking selection : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInBookingCalendar = ws.getLastRowNum()+1;
	    colCntInBookingCalendar = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInBookingCalendar][colCntInBookingCalendar];
	    System.out.println("Rows " + rowCntInBookingCalendar + " " + "Columns" + colCntInBookingCalendar);
	    for(int i=1; i<rowCntInBookingCalendar; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInBookingCalendar;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                    	
	                    		cellData[i][j] = cell.getStringCellValue();
	                    	
	                    }catch(IllegalStateException e){
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}

public String[][] readTestDataForOfferSelection(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for offer selection : " + readExcel);
			FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInOfferSelection = ws.getLastRowNum()+1;
	    colCntInOfferSelection = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInOfferSelection][colCntInOfferSelection];
	    System.out.println("Rows " + rowCntInOfferSelection + " " + "Columns" + colCntInOfferSelection);
	    for(int i=1; i<rowCntInOfferSelection; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInOfferSelection;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                    	
	                    		cellData[i][j] = cell.getStringCellValue();
	                    	
	                    }catch(IllegalStateException e){
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}


public String[][] readTestDataForPayment(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for payment details : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInPaymentInfo = ws.getLastRowNum()+1;
	    colCntInPaymentInfo = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInPaymentInfo][colCntInPaymentInfo];
	    System.out.println("Rows " + rowCntInPaymentInfo + " " + "Columns" + colCntInPaymentInfo);
	    for(int i=1; i<rowCntInPaymentInfo; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInPaymentInfo;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                    	
	                    		cellData[i][j] = cell.getStringCellValue();
	                    	
	                    }catch(IllegalStateException e){
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}

public String[][] readTestDataForPassengerDetails(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for passenger contact details : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInPassengerInfo = ws.getLastRowNum()+1;
	    colCntInPassengerInfo = ws.getRow(0).getLastCellNum();
	    cellData = new String[rowCntInPassengerInfo][colCntInPassengerInfo];
	    System.out.println("Rows " + rowCntInPassengerInfo + " " + "Columns" + colCntInPassengerInfo);
	    for(int i=1; i<rowCntInPassengerInfo; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInPassengerInfo;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                    	
	                    		cellData[i][j] = cell.getStringCellValue();
	                    	
	                    }catch(IllegalStateException e){
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}



public String[][] readTestDataForDifferentContactInfo(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for different contact details : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInDiffContactInfo = ws.getLastRowNum()+1;
	    colCntInDiffContactInfo = ws.getRow(0).getLastCellNum();
	    System.out.println ("Inside different contact info wrapper method..row and column counts: " + rowCntInDiffContactInfo + " " +colCntInDiffContactInfo);
	    cellData = new String[rowCntInDiffContactInfo][colCntInDiffContactInfo];
	    System.out.println("Rows " + rowCntInDiffContactInfo + " " + "Columns" + colCntInDiffContactInfo);
	    for(int i=1; i<rowCntInDiffContactInfo; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInDiffContactInfo;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                    	
	                    		cellData[i][j] = cell.getStringCellValue();
	                    	
	                    }catch(IllegalStateException e){
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   System.out.println ("Inside different contact info wrapper method.." + cellData[1][0]);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}

public String[][] readTestDataForDifferentBillingContactsInfo(String strSheetName) {
	String cellData[][] = null;
		 
		
		try {
			//File readExcel = new File (sAbsPath + "data\\" + "testdata.xls");
			   sFinalPath = sAbsPath + "/data/testdata.xls";
				File readExcel = new File (sFinalPath);
				System.out.println("Test data path for billing contact details : " + readExcel);
			
	    FileInputStream fis = new FileInputStream(readExcel);
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = wb.getSheet(strSheetName);
	    HSSFRow row;
	    HSSFCell cell;
	    rowCntInDiffBillingContactInfo = ws.getLastRowNum()+1;
	    colCntInDiffBillingContactInfo = ws.getRow(0).getLastCellNum();
	    System.out.println ("Inside different contact info wrapper method..row and column counts: " + rowCntInDiffContactInfo + " " +colCntInDiffContactInfo);
	    cellData = new String[rowCntInDiffBillingContactInfo][colCntInDiffBillingContactInfo];
	    System.out.println("Rows " + rowCntInDiffBillingContactInfo + " " + "Columns" + colCntInDiffBillingContactInfo);
	    for(int i=1; i<rowCntInDiffBillingContactInfo; i++){
	        row = ws.getRow(i);
	        if(row != null){
	            for(int j=0;j<colCntInDiffBillingContactInfo;j++){
	                cell = row.getCell(j);
	                if(cell != null){
	                    try{
	                    	
	                    		cellData[i][j] = cell.getStringCellValue();
	                    	
	                    }catch(IllegalStateException e){
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }
	    }
	   System.out.println ("Inside different contact info wrapper method.." + cellData[1][0]);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 return cellData;
			
		}

}