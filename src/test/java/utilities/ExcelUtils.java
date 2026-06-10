package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public String getCellData(int row, int column)
    {
        String data = "";

        try
        {
            FileInputStream fis =
                new FileInputStream("src/test/resources/LoginData.xlsx");

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheetAt(0);

            data = sheet.getRow(row)
                        .getCell(column)
                        .getStringCellValue();

            workbook.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return data;
    }
}