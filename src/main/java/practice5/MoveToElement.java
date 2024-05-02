package practice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//xpath for particular element
	WebElement gmail=driver.findElement(By.xpath("//a[.='Gmail']"));
	Actions a=new Actions(driver);
	a.moveToElement(gmail).contextClick().perform();
	
}
}
