package practice3;


import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

public static void main(String[] args) throws Throwable {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in");
	TakesScreenshot ts=(TakesScreenshot) d;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\LENOVO\\Desktop\\SCREENSHOT\\AMAZON.png");
    Files.copy(src, dest);
}
}
