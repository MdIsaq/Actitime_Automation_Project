package Data_Driven_FW;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_from_Excel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Book01.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Project");
		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(sh.getRow(2).getCell(2));
		System.out.println(data);
		
	}
}
		          

	