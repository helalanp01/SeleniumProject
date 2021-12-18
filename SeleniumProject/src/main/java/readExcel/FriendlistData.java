package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FriendlistData {

	public static void main(String[] args) throws IOException {
		//Enter a workBook
		XSSFWorkbook book=new XSSFWorkbook("./excelHomeWork/ExcelExamplw.xlsx");
		//enter a sheet
		XSSFSheet sheet=book.getSheet("FriendList");
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		for (int i = 1; i < rowCount; i++) {
			
			//for (int j = 0; j < cellCount; j++) {
				System.out.println(i);
				//System.out.println(j);
				System.out.println();
				
			//}
			
		}
		//enter a row
		XSSFRow row=sheet.getRow(3);
		//enter a cell
		XSSFCell cell=row.getCell(4);
		String str=cell.getStringCellValue();
		System.out.println(str);
		
		
		
		
	}
	

}
