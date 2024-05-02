package Experience_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SERE {

	public static void main(String[] args) {
     WebDriver  driver=new ChromeDriver();
     driver.get("https://www.saucedemo.com");
    WebElement UN=driver.findElement(By.xpath("//input[@id='user-name']"));
    driver.navigate().refresh();
    UN.sendKeys("Standard_User");
	}

}
