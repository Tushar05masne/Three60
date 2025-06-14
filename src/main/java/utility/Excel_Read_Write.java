package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Read_Write {
	
	//@Test
	public void getExcel_Data() throws FileNotFoundException, InvalidFormatException {
		
		FileInputStream ip=new FileInputStream("./src/main/resources/com/test/resources/data/IN_PUT.xlsx");
		try {
			Workbook wb = WorkbookFactory.create(ip);
			Sheet My_IN_sheet = wb.getSheet("sheet1");
			
			Object[][] data=new Object[0][0];
			String data_from=null;
			
			for(int i=0;i<My_IN_sheet.getLastRowNum();i++) {
				for(int j=0;j<My_IN_sheet.getRow(0).getLastCellNum();j++) {
					
					 data_from = My_IN_sheet.getRow(i).getCell(j).toString();

				}
				System.out.println(data_from);


				
				
			}
			
			
			
			
			
			
			
			//String cell1 = My_IN_sheet.getRow(1).getCell(2).toString();
			
			//String cell1 = data.toString();
			
			//System.out.println(cell1);
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
