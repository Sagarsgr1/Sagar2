package roompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gt {
	public static void main(String[]args) {
		WebDriver abc=new EdgeDriver();
		abc.get("https://www.flipkart.com");
		String s=abc.getTitle();
		System.out.println(s);
	}

}
