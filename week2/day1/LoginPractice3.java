package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginPractice3 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]"));
		driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
		WebElement createLead = driver.findElement(By.id("createLeadForm_companyName"));
		createLead.sendKeys("Perficient");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesh");
		driver.findElement(By.className("smallSubmit")).click();
	//	driver.close();
	}

}
