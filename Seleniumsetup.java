package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumsetup {
	 public static void main(String[] args) {
		 //webdriver calling
		 WebDriverManager.chromedriver().setup();
		 //chrome driver setup
		 ChromeDriver driver=new ChromeDriver();
		// url calling
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath(("(//div[@class='x-form-element']/input)[14]"))).sendKeys("super");
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.close();
		 
			
		 }



	}


