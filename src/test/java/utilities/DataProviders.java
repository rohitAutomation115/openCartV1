package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] loginDataProvider(){
		
		//path to excel file
		String filepath=".//testData//LoginUserData.xlsx";
		
		//call excel utitlity to read data from sheet1	
		return	ExcelUtil.getTestData(filepath, "Sheet1");	
	}
	
}
