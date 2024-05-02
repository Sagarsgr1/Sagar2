package Experience_practice1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigertry {

	public static void main(String[] args) throws Throwable{
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
		
		String LOGIN=p.getProperty("login");
		System.out.println(BROWSER);
		
		WebDriver d=new ChromeDriver();
		d.get(URL);
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		

	}

}
