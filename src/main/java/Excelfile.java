import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;

public class Excelfile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("Datafile/Book 7 (1).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		short cell = sheet.getRow(lastrow).getLastCellNum();
		System.out.println(lastrow);
		System.out.println(cell);
		
		for (int r = 0; r <=lastrow ; r++) {
			
			XSSFRow currentrow = sheet.getRow(r);
			
			for (int c = 0; c < cell; c++) {
				String to = currentrow.getCell(c).toString();
				System.out.print(to+ "    ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}
}
