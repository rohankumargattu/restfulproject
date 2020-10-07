package johanhaleby;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelXSSFWorkbookForReading 
{
	public static void main(String[] args) throws Exception
	{
		//Read data from .xlsx file
		File f=new File("xssfxlsxreading.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);
		System.out.println(sh.getRow(6).getCell(5));
		//Since there is no data, it will raise NullPointerException
		//So to avoid this exception to raise we use DataFormatter class
		//This class can take any data in String format
		//System.out.println(sh.getRow(45).getCell(12));
		System.out.println(sh.getRow(12).getCell(9));	
	}
}
