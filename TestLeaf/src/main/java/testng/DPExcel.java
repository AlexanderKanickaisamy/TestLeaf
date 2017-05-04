package testng;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPExcel {
	@DataProvider(name = "fetchData")
	public static Object[][] readExcel() throws InvalidFormatException, IOException {
		Object[][] data;
		File src = new File("./data/Login.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(src);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		// wb.close();
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();

		data = new Object[rowcount][columncount];
		// for Rows
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row1 = sheet.getRow(i);
			// for Columns
			for (int j = 0; j < columncount; j++) {
				XSSFCell cell1 = row1.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();

			}
		}

		return data;

	}

}