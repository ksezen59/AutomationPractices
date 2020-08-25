package lib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public FileInputStream fis = null;
    private XSSFWorkbook workbook=null;
    private XSSFSheet sheet = null;
    String path = null;

    public ExcelReader() throws IOException {

        path = System.getProperty("user.dir")+"//TestData//TestData.xlsx";
        fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

    }

    public int getSheetRow(String sheetName){
       int index = workbook.getSheetIndex(sheetName);
        sheet = workbook.getSheetAt(index);
        return ( sheet.getLastRowNum()+1);
    }

    public static void main(String[] args) throws IOException {
        ExcelReader reader = new ExcelReader();
        System.out.println(reader.getSheetRow("LoginTest"));
        System.out.println(reader.getSheetRow("SignUpTest"));

    }

}
