package practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datatoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\PRIYANKA\\eclipse-workspace\\sdet1\\workbook.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheet1");
		Row r=s.getRow(1);
		Cell c=r.createCell(1);
		c.setCellValue("priyanka");	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\PRIYANKA\\eclipse-workspace\\sdet1\\workbook.xlsx");
		wb.write(fos);
		wb.close();

	}


}
