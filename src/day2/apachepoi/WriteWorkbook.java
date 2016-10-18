package day2.apachepoi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteWorkbook {
	public static void main(String[] args) throws InvalidFormatException,
			IOException {
		FileOutputStream fos = new FileOutputStream("data/company.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("employees");
		List<Object[]> data = new LinkedList<Object[]>();
		data.add(new Object[] { "EMP ID", "NAME", "SALARY" });
		data.add(new Object[] { "1", "Shrinivas Shukla", "35000" });
		data.add(new Object[] { "2", "Nikita Joshi", "30000" });
		data.add(new Object[] { "3", "Mohini Gupta", "47500" });
		int rowId = 0;
		for (Object[] objects : data) {
			XSSFRow row = worksheet.createRow(rowId++);
			int cellId = 0;
			for (Object element : objects) {
				XSSFCell cell = row.createCell(cellId++);
				cell.setCellValue((String) element);
			}
		}
		workbook.write(fos);
		workbook.close();
	}
}
