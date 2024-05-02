package roompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class N {
public static void main(String[] args)throws Throwable {
	WebDriver anyname=new EdgeDriver();
	anyname.navigate().to("https://www.flipkart.com");
	Thread.sleep(2000);
	anyname.navigate().to("https://www.facebook.com");
	Thread.sleep(2000);
	anyname.navigate().back();
	Thread.sleep(3000);
	anyname.navigate().forward();
	anyname.navigate().refresh();
	anyname.quit();
}
}
