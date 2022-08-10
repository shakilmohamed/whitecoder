package weeknew1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implict wait for duration of 30seconds
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("mohamed");
		driver.findElement(By.name("lastname")).sendKeys("shakil");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9947024");
		WebElement spd1 = driver.findElement(By.id("day"));
		Select dd1 =new Select(spd1);
		dd1.selectByValue("27");
		WebElement spd2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd2 =new Select(spd2);
		dd2.selectByIndex(1);
		WebElement spd3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd3 =new Select(spd3);
		dd3.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
	}

}
