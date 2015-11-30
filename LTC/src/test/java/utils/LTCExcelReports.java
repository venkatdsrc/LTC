package test.java.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.Hyperlink;

public class LTCExcelReports{
	
public static HSSFWorkbook wb = null;
public static HSSFSheet sheet = null;
public static HSSFRow row=null;
String tcSheetName;
int iCount;
DateFormat dfDate = new SimpleDateFormat("dd-MM-yyyy");
Date sDate = new Date();
String dDate = dfDate.format(sDate);
String sTestRptPath;


	public LTCExcelReports(String testCaseSheetName){

		tcSheetName=testCaseSheetName;
		sTestRptPath = System.getProperty("user.dir")+"\\reports\\"+ tcSheetName + "\\" + dDate + "\\";
		File file = new File(sTestRptPath);
		if(!file.exists()){
			file.mkdirs();
		}
		wb = new HSSFWorkbook();
		sheet = wb.createSheet(testCaseSheetName);
	    reportHeader(); 
		}

	//Method to create Report headers	
	public void reportHeader(){
		System.out.println("Inside reportHeader()");
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("S.No");
		row.createCell(1).setCellValue("Description");
		row.createCell(2).setCellValue("Status");
		
		}

	//Method to close the workbook				
	public void closeWorkbook() throws IOException{
		System.out.println("Inside closeWorkbook()");
		File file = new File(sTestRptPath);
		File[] files = file.listFiles();
		if (files != null) {
			iCount = files.length;
			iCount = iCount + 1;
		}
		else {
			iCount = 1;
		}
	    FileOutputStream fos = new FileOutputStream(new File(sTestRptPath+ "Run"+iCount+".xls"));
		wb.write(fos);
		fos.close();
		} 
//Method to report test case status 		
	public void reportEvent(String tcID,String tcDesc,String tcStatus){
		
		
		HSSFCellStyle style = wb.createCellStyle();
		HSSFFont font = wb.createFont();
		font.setColor(HSSFColor.BLACK.index);
		style.setFillBackgroundColor(HSSFColor.DARK_GREEN.index);
				
		//style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setFont(font);
		System.out.println("Inside reportEvent()" + tcStatus);
		int newRow= sheet.getLastRowNum()+1;
		CellStyle cstyle;
		row = sheet.createRow(newRow);			
		Cell cell1,cell2,cell3,cell4=null;
		cell1=row.createCell(0);
		cell1.setCellValue(tcID);
		cell2=row.createCell(1);
		cell2.setCellValue(tcDesc);
		cell3=row.createCell(2);
		cell3.setCellValue(tcStatus);
		cell3.setCellStyle(style);
		
		}

	
	
}
