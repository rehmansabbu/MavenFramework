package com.test.ui.excel.dataread;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.ui.browsersetup.BrowserSetup;


public class ExcelData extends BrowserSetup
{
	
	
	//From Excel
		public static String pathOfFile_ForRetrieveTheDataFromExcel="InputData\\getData.xlsx";
	
		
	public static String getCellValue(String sheetName, int rowNum, int cellNum) throws InvalidFormatException, IOException
	{
        FileInputStream fis = new FileInputStream(pathOfFile_ForRetrieveTheDataFromExcel);
        Workbook wb = WorkbookFactory.create(fis);
        CellType type = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getCellType();
        String value = "";
        
        if(type==CellType.STRING)
        {
            value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();   
        }
        else if(type==CellType.NUMERIC)
        {
            int numValue = (int) wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
            value = ""+numValue;
        }
        else if(type==CellType.BOOLEAN)
        {
            boolean boolValue =  wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
            value = ""+boolValue;
        }
        return value;

}
	
	
}
	
	
