package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     // it will get the title of webpage
     driver.get("https://www.facebook.com");
     // take the title of page
     String tit=driver.getTitle();
     System.out.println(tit);
	}

}
