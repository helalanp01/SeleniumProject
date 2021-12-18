package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// Open the woorkbook
		XSSFWorkbook wb=new XSSFWorkbook("./excelHomeWork/ExcelExamplw.xlsx");
		XSSFSheet sheet=wb.getSheet("book");
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		String svalue=cell.getStringCellValue();
		System.out.println(svalue);

	}

}
