package genricLibOrUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadindDataFromExcel 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\Selenium\\M6TestcaseData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		//Row r=sh.getRow(2);
		//Cell c=r.getCell(1);
		String value=sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
		
		
		
	}

}
