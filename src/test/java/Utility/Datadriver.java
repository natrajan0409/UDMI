package Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriver 
	{
		 XSSFWorkbook WB;
		XSSFSheet sheet;
			
		public Datadriver ()
		{
		try
			{
			FileInputStream fis = new FileInputStream ("E:\\ECLIPS\\workspace\\Viji\\src\\test\\resources\\Excel\\Testdata.xlsx");
			WB = new XSSFWorkbook (fis);
			}
			catch(Exception R)
			{
			System.out.println(R.getMessage());
			}
		}
		
		public  Object  Getdata (int sheetnumber,int row,int coloumn)
		{
			sheet = WB.getSheetAt(sheetnumber);
			XSSFRichTextString data = sheet.getRow(row).getCell(coloumn).getRichStringCellValue();
					return (Object) data;
					
		}
		public int getrowcount(int sheetindex)
		{
			int row = WB.getSheetAt(sheetindex).getLastRowNum();
			row= row+1;
			
			return row;
			
		}

		
	}
	
