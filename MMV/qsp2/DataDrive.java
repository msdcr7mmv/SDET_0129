package qsp2;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
 import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrive {
	public static void main(String[] args) throws Throwable  {
//		FileInputStream fis=new FileInputStream("C:\\kcsm6\\Automation\\data.xlsx");
//		
//		Workbook web=WorkbookFactory.create(fis);
//		
//		Sheet ash=wb.getSheet("Sheet1");
//		
//	Row r=sh.getRow(9);	
//	Cell c=r.getCell(1);
//	String xlval=c.getStringCellValue();
//		
//		System.out.println(xlval);
		
		FileInputStream fis=new FileInputStream("C:\\KCSMV\\VALI\\data\\fighters.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		System.out.println(wb.getSheet("Sheet1").getRow(7).getCell(1));
	}
}
