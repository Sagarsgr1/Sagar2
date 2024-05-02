package practice2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
	
	
	public class CreateNewFbAcc {
		public static void main(String[] args)throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//create new account btn
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	// first name
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sagar");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("prusty");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9777883982");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("")).sendKeys("9777883982");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sagar1234@");
	//store day dd of reference variable
	Thread.sleep(1000);
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	//create object of select class
	Thread.sleep(1000);
	Select s=new Select(day);
	s.selectByVisibleText("11");
	//month selection
	Thread.sleep(1000);
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	//create object of select class
	Thread.sleep(1000);
	Select s1=new Select(month);
	s1.selectByVisibleText("Sep");
	//year selection
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	//create object of select class
	Thread.sleep(1000);
	Select s2=new Select(year);
	s2.selectByVisibleText("1996"); 
	//store gender select
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	//otp type manually 70117142 
	//manually type continue

	System.out.println("facebook new ac is created");
//signout
	driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
	driver.findElement(By.xpath("//span[@id=':ra:']")).click();
		}
}
