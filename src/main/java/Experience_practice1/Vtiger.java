package Experience_practice1;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import practice5.MoveToElement;

public class Vtiger {

	public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	//UN
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//PWD
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	//click on login btn
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//click on 
	driver.findElement(By.xpath("//td[@class='tabUnSelected'][3]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Wipr19");
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	Thread.sleep(2000);
	WebElement sela=driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
	Actions a=new Actions(driver);
	//a.click(sela).perform(); //click                                              
	a.moveToElement(sela).perform();
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
    driver.close();
	}

}
