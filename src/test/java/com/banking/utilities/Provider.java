package com.banking.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Provider {

	@DataProvider
	public Object[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\com\\banking\\testData\\Libro1.xlsx";
	
		ExcelUtilities exUtilities = new ExcelUtilities(path);
		int totalRows = exUtilities.getRowCount("Hoja1");
		int totalCols = exUtilities.getCellCount("Hoja1", 1);

		Object[][] data = new Object[totalRows][totalCols];

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				data[i - 1][j] = exUtilities.getCellData("Hoja1", i, j);
			}
		}

		return data;
	}

}
