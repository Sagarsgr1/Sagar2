package practice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	//srcelement
	WebElement srcele=driver.findElement(By.xpath("//div[@id='div1']"));
	//destelement
	WebElement destele=driver.findElement(By.xpath("//div[@id='div2']"));
			
	Actions a=new Actions(driver);
	    a.dragAndDrop(srcele, destele).perform();
			

	}

}
