package Experience_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	    WebElement UN=driver.findElement(By.xpath("//input[@type='text']"));
	    UN.sendKeys("sagarprusty15@gmail.com");

	}

}
