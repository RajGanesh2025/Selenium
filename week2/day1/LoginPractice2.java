package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.id("ext-gen872")).click();
//		driver.findElement(By.linkText("/crmsfa/control/leadsMain")).click();
//		driver.findElement(By.linkText("crmsfa/control/createLeadForm")).click();
//		WebElement createLead = driver.findElement(By.id("createLeadForm_companyName"));
//		createLead.sendKeys("Perficient");
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesh");
//		driver.findElement(By.className("smallSubmit")).click();
//		driver.close();
	}

}
