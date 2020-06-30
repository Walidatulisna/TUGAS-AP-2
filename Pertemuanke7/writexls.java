/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuanke7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Walidatul Isna
 */
public class writexls {
    public static void main(String[] args) throws IOException {
        Properties properti = new Properties();
        properti.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(properti);
        String out = "D:\\isnaa.xls";
        FileOutputStream outdocx = new FileOutputStream(new File(out));
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("java");
         
        Object[][] bookData = {
                {"Walidatul Isna"},
                {"1855201019"},
                {"Ilkom 4A"},
                {"UNU BLITAR"},
        };
 
        int rowCount = 0;
         
        for (Object[] aBook : bookData) {
            Row row = sheet.createRow(++rowCount);
             
            int columnCount = 0;
             
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }    
        }
        try (FileOutputStream outputStream = new FileOutputStream("Java.xlsx")) {
            workbook.write(outputStream);
        }
    }
}
