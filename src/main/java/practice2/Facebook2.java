package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
//write expression for Email id
driver.findElement(By.xpath("(//input)[3]")).sendKeys("sagarprusty15@gmail.com");
//pwd
driver.findElement(By.xpath("(//input)[4]")).sendKeys("2sagar@@sgr1");
//login
driver.findElement(By.xpath("(//button)")).click();

	}

}
