package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args)  throws EncryptedDocumentException, IOException
	{

		//Read data from IPL Sheet
		
		//implementation of read the data from excel
		
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");   //provide path of the file
		Workbook wb=WorkbookFactory.create(fis);  //make the file for ready to read
		Sheet sheet=wb.getSheet("IPL");  //get into the sheet
		Row row=sheet.getRow(3);  //get into the desired row
		Cell cell=row.getCell(1);  //get into the desired cell/column
		String data=cell.getStringCellValue();  //read the data form cell
		System.out.println(data);
	}

}
