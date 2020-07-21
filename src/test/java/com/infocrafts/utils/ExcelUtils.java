package com.infocrafts.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet xcelWSheet;
	private static XSSFWorkbook xcelWBook;
	private static XSSFCell cell;
	private static File file = new File(System.getProperty("user.dir") + "/src/test/resources");
	private static String fileName = "/peststreamDATA.xlsx";

	public ExcelUtils() {

	}

	/*
	 * This method is to set the File path and to open the Excel file, Pass
	 * Sheetname as Arguments to this method
	 */
	public static void setExcelFile(String sheetName) {
		InputStream input = null;
		try {

			// Open the Excel file
			input = new FileInputStream(file + fileName);
			xcelWBook = new XSSFWorkbook(input);
			xcelWSheet = xcelWBook.getSheet(sheetName);
			System.out.println("Excel sheet opened");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

	/*
	 * This method is to read the test data from the Excel cell, in this we are
	 * passing parameters as Row num and Col num
	 */

	public static String getCellData(int rowNum, int colNum) {

		String data = "";

		try {
			cell = xcelWSheet.getRow(rowNum).getCell(colNum);

			switch (cell.getCellTypeEnum()) {
			case BOOLEAN:
				data = cell.getBooleanCellValue() + "\t\t";
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
					data = formatter.format(cell.getDateCellValue()).trim();

				} else {
					data = cell.getRawValue().trim();
				}
				break;
			case STRING:
				data = cell.getStringCellValue().trim() + "\t\t";
				break;
			case FORMULA:
				data = cell.getCellFormula();
				break;
			case BLANK:
				System.out.println("BLANK");
				break;
			default:
				System.out.println("BLANK");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return data;

	}

	/*
	 * This method is to write the data into Excel cell, in this we are passing
	 * parameters as Row num , Col num and data to be write
	 */
	public static void setData(int rowNum, int cellNum, String writeData) {

		FileOutputStream fileOut;
		try {
			XSSFRow row = xcelWSheet.getRow(rowNum);
			cell = row.getCell(cellNum);
			if (cell != null) {
				cell.setCellValue(writeData);
			} else {
				row = xcelWSheet.getRow(rowNum);
				cell = row.createCell(cellNum);
				cell.setCellValue(writeData);
			}
			fileOut = new FileOutputStream(file);
			xcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	/*
	 * This method is returned column number for matching heading. Pass the
	 * heading details as parameter
	 */
	public static int getCellNumber(String matchingColumn) {
		try {
			int colLength = xcelWSheet.getRow(0).getLastCellNum();

			for (int i = 0; i <= colLength; i++) {
				String columnName = getCellData(0, i);
				if (columnName != null && matchingColumn.equals(columnName.trim())) {
					int matchingColNumber = i;
					//Log.info("Column number = " + matchingColNumber);
					return matchingColNumber;
				}
			}
		} catch (Exception n) {
			System.out.println("Unable to get cell number with name " + matchingColumn + n.getMessage());

		}

		return -1;
	}
	/*
	 * This method is returned row number for matching details. Pass the
	 *  details as parameter
	 */
	public static int getRowNumber(String matchingColumn,String rowDetails) {
	
		try {
			int matchingColNumber = -1;

			matchingColNumber = getCellNumber(matchingColumn);

			if (matchingColNumber > -1) {
				int rowLength = xcelWSheet.getLastRowNum();

				for (int rowCount = 0; rowCount <= rowLength; rowCount++) {
					String colData = getCellData( rowCount, matchingColNumber).trim();
					if (colData.equals(rowDetails)) {
						return rowCount;
					}
				}
			}
		} catch (NullPointerException n) {
			System.out.println("Row number can not found "+n.getMessage());

		}
		return -1;
		

	}

}