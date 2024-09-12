package com.erlangga.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;

import com.erlangga.day7.exceptions.FileInvalidPathExeception;
import com.erlangga.day7.exceptions.FileInvalidTypeTotalAndPrice;
import com.erlangga.day7.exceptions.FileInvalidColoumnData;

public class FileHandling {
	private static ArrayList<String> dataCSV = new ArrayList<>();

	public static void readFromFile(String filePath) {
		if (filePath == null || filePath.isEmpty()) {
			throw new FileInvalidPathExeception();
		}

		try {
			File file = new File(filePath);
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				dataCSV.add(data);
			}

			totalSales();
			totalProductSold();
			mostBoughtProduct();
			leastBoughtProduct();

			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		} finally {
			System.out.println("File reading completed!");
		}
	}

	public static void totalSales() {
		BigDecimal totalSales = BigDecimal.ZERO;

		try {
			for (int i = 1; i < dataCSV.size(); i++) {
				String[] dataArray = dataCSV.get(i).split(",");
				System.out.println("dataArray: " + dataArray.length);
				if (dataArray.length < 3 || dataArray.length > 3) {
					throw new FileInvalidColoumnData("Row " + i + " does not have enough columns or more than 3 columns");
				}
					int quantity = parseInteger(dataArray[1], i);
					BigDecimal price = parseBigDecimal(dataArray[2], i);
				totalSales = totalSales.add(price.multiply(BigDecimal.valueOf(quantity)));
			}
		} finally {
			System.out.println("Total sales: " + totalSales);
		}
	}

	public static void totalProductSold() {
		int totalProductSold = 0;

		try {
			for (int i = 1; i < dataCSV.size(); i++) {
				String[] dataArray = dataCSV.get(i).split(",");
				if (dataArray.length < 2 || dataArray.length > 2) {
					throw new FileInvalidColoumnData("Row " + i + " does not have enough columns or more than 2 columns");
				}
				totalProductSold += parseInteger(dataArray[1], i);
			}
		} finally {    
			System.out.println("Total products sold: " + totalProductSold);
		}
	}

	public static void mostBoughtProduct() {
		int mostBoughtQuantity = 0;
		String productName = "";

		try {
			for (int i = 1; i < dataCSV.size(); i++) {
				String[] dataArray = dataCSV.get(i).split(",");
				if (dataArray.length < 2 || dataArray.length > 2) {
					throw new FileInvalidColoumnData("Row " + i + " does not have enough columns or more than 2 columns");
				}
				int quantity = parseInteger(dataArray[1], i);
				if (quantity > mostBoughtQuantity) {
					mostBoughtQuantity = quantity;
					productName = dataArray[0];
				}
			}
		} finally {
			System.out.println("Most bought product: " + productName);
		}
	}

	public static void leastBoughtProduct() {
		int leastBoughtQuantity = Integer.MAX_VALUE;
		String productName = "";

		try {
			for (int i = 1; i < dataCSV.size(); i++) {
				String[] dataArray = dataCSV.get(i).split(",");
				if (dataArray.length < 2 || dataArray.length > 2) {
					throw new FileInvalidColoumnData("Row " + i + " does not have enough columns or more than 2 columns");
				}
				int quantity = parseInteger(dataArray[1], i);
				if (quantity < leastBoughtQuantity) {
					leastBoughtQuantity = quantity;
					productName = dataArray[0];
				}
			}
		} finally {
			System.out.println("Least bought product: " + productName);
		}
	}
	
	private static int parseInteger(String value, int rowNumber) {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new FileInvalidTypeTotalAndPrice("Invalid number format for quantity at row " + rowNumber);
		}
	}

	private static BigDecimal parseBigDecimal(String value, int rowNumber) {
		try {
			return new BigDecimal(value);
		} catch (NumberFormatException e) {
			throw new FileInvalidTypeTotalAndPrice("Invalid number format for price at row " + rowNumber);
		}
	}
}
