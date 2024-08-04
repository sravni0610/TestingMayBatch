package Webdriver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Excelwrite {

    public static void main(String args[]) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");

        Object [][] bookdata = {
                {"First Java Book","John",500},
                {"Second Java","Bobby",600},
                {"Third Java","Chris",700}
        };

        int rowcount = 0;
        for(Object[] abook : bookdata){
            Row row = sheet.createRow(++rowcount);
            int columncount =0;
            for(Object field : abook){
                Cell cell = row.createCell(++columncount);

                if(field instanceof String){
                    cell.setCellValue((String)field);
                }
                else if (field instanceof  Integer) {
                    cell.setCellValue((Integer)field);


                }
            }

            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\sravn\\Documents\\juneevng\\Test234.xlsx");
            workbook.write(outputStream);

        }
    }

}
