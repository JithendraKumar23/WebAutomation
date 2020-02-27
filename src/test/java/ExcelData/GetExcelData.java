package ExcelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	
	public static void main(String[] args)
	{
		System.out.println("jjj");
	}
	
	
	public static void getRowCount()
	{
		
		try {
			String projectpath = System.getProperty("user.dir");
			@SuppressWarnings("deprecation")
			XSSFWorkbook wb = new XSSFWorkbook(projectpath+"TakeExcelData\\dummy.xlsx");
			
			XSSFSheet sheet = wb.getSheet("User_Date");
			int n1 = sheet.getLastRowNum();
			//int n2 = sheet.getPhysicalNumberOfRows();
			
			System.out.println(n1);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
