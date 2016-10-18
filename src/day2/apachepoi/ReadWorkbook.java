package day2.apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWorkbook {
	public static void main(String[] args) throws InvalidFormatException,
			IOException {
		FileInputStream fis = new FileInputStream("data/company.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		for (Sheet sheet : workbook) {
			System.out.println("SHEET : " + sheet.getSheetName());
			for (Row row : sheet) {
				for (Cell cell : row) {
					System.out.print(cell.getStringCellValue() + ",");
				}
				System.out.println();
			}
		}
		workbook.close();
	}
}
