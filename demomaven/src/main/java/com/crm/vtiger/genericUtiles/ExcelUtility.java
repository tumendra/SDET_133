package com.crm.vtiger.genericUtiles;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtility {
	
	/*
	 * @param sheetName 
	 * @param rownum
	 * @param cellnum
	 * @return cell string
	 * @throws Throwable
	 */
	
	public String getExcelData(String sheetName,int rownum,int cellnum) throws Throwable {
		
		FileInputStream file=new FileInputStream(IpathConstant.EXCELPATH);
		Workbook workbook=WorkbookFactory.create(file) 
		Sheet sheet=workbook.getSheet(sheetName);
		Row row=sheet.getRow(rownum);
	    Cell cell=row.getCell(cellnum);
	    return cell.getStringCellValue();
	}
	
	/*
	 * this method return all the data in  the sheet
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	public Object[][] getExceldata(String sheetName) throws Throwable {
		
		FileInputStream file=new FileInputStream(IpathConstant.EXCELPATH);
		Workbook workbook=WorkbookFactory.create(file) 
		Sheet sheet=workbook.getSheet(sheetName);
		
		int lastrow=sheet.getLastRowNum();
		int lastcell=sheet.getRow(arg0)
		
	}
	
	 */
	
	}
