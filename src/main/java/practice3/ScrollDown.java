package practice3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown  {
public static void main(String[] args) throws Throwable {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in");
	//type casting
	Thread.sleep(1000);
	JavascriptExecutor jse=(JavascriptExecutor)d ;
	jse.executeScript("window.scrollBy(0,2000)");
	//scroll up
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-1000)");
		
}
}
