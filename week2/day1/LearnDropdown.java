package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_dataSourceId"));

		/*
		 * To select a dropdown there are three steps: 1.Locate the element (dropdown
		 * element has keyword select) =
		 * driver.findElement(By.id("createLeadForm_dataSourceId")); //Create a variable
		 * by pressing ctrl+2 & L 2.Create an object for Select class = Type the Syntax
		 * "Select drpdown = new Select" it gives an option to select webelement.
		 * 3.Choose the option by text or value or index
		 * 
		 * 
		 */
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdown = new Select(dropdown);

		// selecting the dropdown option by text
		// drpdown.selectByVisibleText("Public Relations");

		// selecting by value
		// drpdown.selectByValue("LEAD_TRADESHOW");

		// select by index
		// drpdown.selectByIndex(5);

		//selecting a particular value, for ex: selecting a value 2nd from the last
		int size = drpdown.getOptions().size();
		drpdown.selectByIndex(size-2);
		
	}

}
