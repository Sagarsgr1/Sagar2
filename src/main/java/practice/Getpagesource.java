package practice;
// it will give sourcecode of html page

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getpagesource {
public static void main (String [] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	String page=driver.getPageSource();
	System.out.println(page);
}
}
