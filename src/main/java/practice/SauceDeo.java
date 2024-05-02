package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDeo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	//un
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//pwd
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//login
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.className("inventory_item_img")).click();
driver.navigate().refresh();
Thread.sleep(3000);
driver.get("https://flipkart.com");
driver.findElement(By.className("uiU-ZX")).sendKeys("9777883982");
	}
}
