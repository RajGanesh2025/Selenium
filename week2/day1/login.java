package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {

		// To launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URl
		driver.get("http://leaftaps.com/opentaps");
		// Maximize the browser
		driver.manage().window().maximize();
		// To get pagetitle, driver.getTitle
		String title = driver.getTitle();
		// type driver.getTitle, press ctrl+2 and then L. This is to create a variable
		// and assign the function to it.
		System.out.println(title);
		// To enter Username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		// To enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// To click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// To click CRM/SFA button
		driver.findElement(By.linkText("CRM/SFA")).click();
		// To click on Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		// To close the browser
		driver.close();
	}

}
