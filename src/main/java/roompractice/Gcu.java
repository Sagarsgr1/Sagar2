package roompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gcu {

	public static void main(String[] args) {
	WebDriver a=new EdgeDriver();
	a.get("https://www.google.com");
	String url=a.getCurrentUrl();
	System.out.println(url);
	}

}
