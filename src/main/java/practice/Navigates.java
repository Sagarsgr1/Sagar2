package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigates {
public static void main (String[] args) throws Throwable	{
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(5000);
	driver.navigate().to("https://www.instagram.com");
	Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);
    driver.navigate().forward();
    // refresh the page
    driver.navigate().refresh();
    // exit the page
  driver.quit();
}
}
