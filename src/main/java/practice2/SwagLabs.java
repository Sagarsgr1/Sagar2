package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//un
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	//pwd
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	//login
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//get the title of Homepage
	String actT=driver.getTitle();
	System.out.println(actT);
	String expT="Swag Labs";
	//verification
	if(expT.equals(actT)) {
	System.out.println("Boss user is navigate to home page");
	}
	else {
		System.out.println("Boss login is not done properly");
	}
}
}
