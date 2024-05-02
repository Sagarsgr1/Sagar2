package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GGetbooleandata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\src\\test\\resources\\Testdata.xlsx");
		boolean data=WorkbookFactory.create(fise).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data);

	}

}
