package weeknew1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//setup password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//check correct page
		//String text=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(text);
		//click the crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("mohamed");
		driver.findElement(By.id("lastNameField")).sendKeys("shakil");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("super");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("super");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("shakil");
		driver.findElement(By.id("createContactForm_description")).sendKeys("shakil");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("shakil.8680@gmail.com");
		WebElement dd1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select spd1=new Select(dd1);
		spd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("super super super");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String singam = driver.getTitle();
		System.out.println(singam);
		
		
		
		
		
		
		}

}
