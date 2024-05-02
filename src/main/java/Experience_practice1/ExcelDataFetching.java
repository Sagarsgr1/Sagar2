package Experience_practice1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {


		public static void main(String[] args) throws Exception {
	FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\TestData.xlsx");
  String data=WorkbookFactory.create(fise).getSheet("Sheett1").getRow(0).getCell(0).getStringCellValue();
  System.out.println(data);
		}
}

