package ReadExcelData;     //SUCCESSFUL

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDatafromexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	

	//Read Multiple data from IPL Sheet
	
			//implementation of read the data from excel
	//read multiple data or values from excel sheet by using for loop
			for(int i=1;i<=10;i++)   //we want just the data and not the heading thats y took 1 and not 0
				
			{
				FileInputStream fis=new FileInputStream("./data/TestData.xlsx");  //provide path of the file
			Workbook wb=WorkbookFactory.create(fis); // make the file Read to read
			Sheet sheet=wb.getSheet("IPL"); //get into the sheet among all the sheets
			Row row=sheet.getRow(i); //get into the sheet
			Cell cell=row.getCell(1);//get into the desired cell/column
			String data=cell.getStringCellValue(); // read the value for cell
			Thread.sleep(2000);
			System.out.println(data);
}
}
}
