package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel_invalid {
	public  Object[][]read_excel_sheet_invalid() throws InvalidFormatException, IOException
	{
		File myfile=new File(".\\Test_Data\\Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(myfile);
		XSSFSheet mysheet=wb.getSheet("Sheet1");
	int number_of_rows=mysheet.getPhysicalNumberOfRows();
	int number_ofcolumns=mysheet.getRow(0).getLastCellNum();
	Object[][]myarray=new String[number_of_rows-1][number_ofcolumns];
	for(int i=1;i<number_of_rows;i++)
	{
		for(int j=0;j<number_ofcolumns;j++)
		{
			XSSFRow row=mysheet.getRow(i);
			myarray[i-1][j]=row.getCell(j).getStringCellValue();
		}
	}
		
		
		return myarray;
	}

}
