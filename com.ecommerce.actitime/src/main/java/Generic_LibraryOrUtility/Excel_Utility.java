package Generic_LibraryOrUtility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

	public String getDataFromExcel(String SheetName,int rowName,int cellName) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.EXCELPATH);
				Workbook book = WorkbookFactory.create(fis);
				Sheet sh = book.getSheet(SheetName);
				DataFormatter df = new DataFormatter();
			
				String data = df.formatCellValue(sh.getRow(rowName).getCell(cellName));
				return data;
				
			}
		}
			

	