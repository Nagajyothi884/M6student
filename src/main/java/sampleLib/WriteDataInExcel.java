package sampleLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genricLibOrUtility.Iconstantutility;

public class WriteDataInExcel 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(12).createCell(2).setCellValue("welcome");
		FileOutputStream fos=new FileOutputStream(Iconstantutility.excelpath);
		book.write(fos);
		System.out.println("pass");
				
		
	}

}
