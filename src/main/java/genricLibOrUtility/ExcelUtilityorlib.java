package genricLibOrUtility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityorlib 
{
	public String ReadindDataFromExcel(String SheetName,int rowNum , int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(SheetName);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
		
				
	}
	
	
	
	
	
	
	
	
	/**
	 * this is generic method to write data in excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 * @throws Exception 
	 * 
	 */

	public void WriteDataInExcel(String sheetName,int rowNum,int cellNum,String value) throws Exception 
	{
		FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(Iconstantutility.excelpath);
		book.write(fos);
	
				
		
	}

}
