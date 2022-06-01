package utils;


import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public ExcelUtils() {
		try {
			String excelPath = Constants.excelDataPath;
			String sheetName = Constants.excelSheetName;
			workBook = new XSSFWorkbook(excelPath);
			sheet = workBook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getCellDataString(int rowNum, int cellNum) {
		return sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
}
