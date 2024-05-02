package Experience_practice1;

import java.io.FileInputStream;
import java.util.Properties;

public class NotepadFetching {

	public static void main(String[] args) throws Throwable {
		FileInputStream fisp=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\CommonDataFetching.properties");
		Properties p=new Properties();
		p.load(fisp);
		String URL=p.getProperty("url");
		System.out.println(URL);
		
		String UN=p.getProperty("un");
		System.out.println(UN);
		
		String PWD=p.getProperty("pwd");
		System.out.println(PWD);
		
		String BROWSER=p.getProperty("browser");
		System.out.println(BROWSER);
		

	}

}
