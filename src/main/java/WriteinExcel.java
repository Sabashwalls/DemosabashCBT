import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteinExcel {

	public static void main(String[] args) throws IOException {
		
		 FileOutputStream file = new FileOutputStream("Datafile/myfile.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet();
		 XSSFRow row = sheet.createRow(0);
		 XSSFRow row1 = sheet.createRow(1);
		 
		 //without looping
		 /*row.createCell(0).setCellValue("xzy");
		 row.createCell(1).setCellValue("string");
		 row.createCell(2).setCellValue("string123");
		 
		 row1.createCell(0).setCellValue("xcfv");
		 row1.createCell(1).setCellValue("asdasdas");
		 row1.createCell(2).setCellValue("3fsvf");
		 */
		 
		 //looping statement
		 for (int r = 0; r <=5; r++) {
			XSSFRow create = sheet.createRow(r);
			
			for (int c = 0; c <5 ; c++) {
				create.createCell(c).setCellValue("one");
			}
		}
		 
		 workbook.write(file);
		 workbook.close();
		 System.out.println("ddone");

	}

}
