package DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GGetNumericdata {

	public static void main(String[] args) throws IOException {
		FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\src\\test\\resources\\Testdata.xlsx");
		double data=WorkbookFactory.create(fise).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data);

	}

}
