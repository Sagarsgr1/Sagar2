package DDF;
//string>> getstringcellvalue()
//boolean>>getbooleancellvalue()
//numeric>> getnumericcellvalue()
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldatafetching {

	public static void main(String[] args) throws Throwable{
		FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\src\\test\\resources\\Testdata.xlsx");
String data=WorkbookFactory.create(fise).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
	}

}
