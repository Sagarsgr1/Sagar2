 package practice4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SIngleElementscrnshtGoogle {

	public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//xpath for individual element
	WebElement ele=driver.findElement(By.xpath("//img[@class='lnXdpd']")); 

    TakesScreenshot  ts=(TakesScreenshot)driver;
    //take a scnsht of element
    File source=ts.getScreenshotAs(OutputType.FILE);
    //path folder
    File dest=new File("C:\\Users\\LENOVO\\Desktop\\SCREENSHOT\\LOGO.png");
    //copy
    Files.copy(source, dest);

	}

}
