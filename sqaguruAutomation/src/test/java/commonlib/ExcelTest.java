package commonlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class ExcelTest {
	@DataProvider(name="GoogleDataProvider")

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readExcelData();
	}

	public static Object[] readExcelData() throws FileNotFoundException, IOException {

		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(
				"D:\\Selenium code\\selenium_testing\\resource\\TestData\\TestNgDataProviderUsingExcelTest.xls"));
		HSSFSheet sheet = workbook.getSheet("testdata");
		int rowsCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Reporter.log("rowsCount" + rowsCount, true);
		Reporter.log("ColumnCount" + columnCount, true);
		Object[] object = new Object[rowsCount - 1];
		for (int rowCounter = 1; rowCounter < rowsCount; rowCounter++) {
			Map<String, String> keyValues = new HashMap<String, String>();
			HSSFRow headerRow = sheet.getRow(0);
			HSSFRow row = sheet.getRow(rowCounter);

			for (int columnCounter = 0; columnCounter < columnCount; columnCounter++) {

				String cellColumn = headerRow.getCell(columnCounter).getStringCellValue();
				String celldata = row.getCell(columnCounter).getStringCellValue();
				Reporter.log(celldata + "cellColumn" + cellColumn);
				keyValues.put(cellColumn, celldata);
			}
			object[rowCounter - 1] = keyValues;
		}
		return object;

	}
}
