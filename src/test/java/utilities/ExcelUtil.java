package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	
	public static Object[][] getTestData(String filepath, String sheetname){
		
		Object[][] data=null;
		try {
			
		//load excel file
		FileInputStream fis=new FileInputStream(filepath);
		
		//create workbook instance for .xlsx file
		Workbook workbook=WorkbookFactory.create(fis);
		
		//Get desired sheet by name
		Sheet sheet=workbook.getSheet(sheetname);

		//get total numebr of rows (excluding header)
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		//get total number of column (from first row)
		int colCount=sheet.getRow(0).getLastCellNum();
		
		//Initialize data array (rows-1) because first row is header
		data=new Object[rowCount-1][colCount];
		
		//Loop through rows(Starting from 1 to skip header)
		
		for(int i=1; i<rowCount; i++)
		{
			Row row=sheet.getRow(i);
			
			//Loop through col
			for(int j=0; j<colCount; j++)
			{
				//Get cell value as string & store in data array
				Cell cell=row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
}
