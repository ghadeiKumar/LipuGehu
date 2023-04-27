package autoframework;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellLibrary implements Autoconstant
{
	public static String excelldata(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fs=new FileInputStream(excellpath);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		//Sheet s	=wb.getSheet(sheet);
		//Row r=s.getRow(row);
		//Cell c=r.getCell(cell);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}
}