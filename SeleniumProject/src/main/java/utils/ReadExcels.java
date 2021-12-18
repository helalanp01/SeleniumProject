package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcels  { 
	public static String[][] main(String []args) throws IOException {
	//ReadExcel 
	//XML Spread Sheet Format
	XSSFWorkbook w=new XSSFWorkbook("C:\\Users\\helal\\eclipse-workspace\\SeleniumProject\\data\\ExcelExample1.xlsx");
	//XSSFSheet sheet=w.getSheet("FriendList");
	XSSFSheet sheet=w.getSheetAt(0);
	//XSSFRow row=sheet.getRow(0);
	//XSSFCell cell=row.getCell(1);

	//RowCount
	int rowcount=sheet.getLastRowNum();
	System.out.println(rowcount);
	//-ColumnCount
	int columnCount=sheet.getRow(0).getLastCellNum();
	 //String 2d data
	//String[][]data=new String[0][3];
	String[][]data=new String[rowcount][columnCount];
	//opent for loop for row
	for(int i=0; i<=rowcount;i++) {
		XSSFRow row=sheet.getRow(i);
		//open loop for column
		for(int j=1;j<=columnCount;j++) {
			XSSFCell cell=row.getCell(j);
			//read value
			String value=cell.getStringCellValue();
			System.out.println(value);
			
			//data[0][0]="Tcs";
			data[i-1][j]=value;
		}
	}
	return data;

	}}

