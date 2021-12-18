package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEx {

	public static void main(String[] args) throws IOException {
		//write/enter excel wookbook
		//create workbook obj
		//XSSF=XML SpreedSheet Format
		XSSFWorkbook workbook=new XSSFWorkbook("./excelHomeWork/ExcelExample.xlsx");
		//Enter sheet spreedSheet
		//Create Sheet class obj
		XSSFSheet sheet=workbook.getSheet("book");
		//enter row in spreedsheet
		XSSFRow row=sheet.getRow(9);
		XSSFRow in=sheet.getRow(0);
		//enter column in spreed sheet
		XSSFCell cell=row.getCell(0);
		XSSFCell convert=in.getCell(0);
		
		String cName=convert.getStringCellValue();
		String gameName=cell.getStringCellValue();
		System.out.println(gameName);
		System.out.println(cName);
		
		

	}

}
