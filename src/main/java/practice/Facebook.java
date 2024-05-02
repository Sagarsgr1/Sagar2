package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	// write expression for email id
  driver.findElement(By.id("email")).sendKeys("sagarprusty15@gmail.com");
  //password
  driver.findElement(By.id("pass")).sendKeys("2sagar@@sgr1");
  //login
  driver.findElement(By.name("login")).click();
}
}