package pOc;

import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicRadioButtonUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CuraHealthcare {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.id("btn-make-appointment")).click();
		WebElement userName = driver.findElement(By.xpath("//input[@id='txt-username']"));
		userName.sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		driver.findElement(By.id("combo_facility"));
		/*
		 * FROM LEARNDROPDOWN WEEK2.DAY1 To select a dropdown there are three steps:
		 * 1.Locate the element (dropdown element has keyword select) =
		 * driver.findElement(By.id("createLeadForm_dataSourceId")); //Create a variable
		 * by pressing ctrl+2 & L 2.Create an object for Select class = Type the Syntax
		 * "Select drpdown = new Select" it gives an option to select webelement.
		 * 3.Choose the option by text or value or index
		 */
		WebElement dropdown = driver.findElement(By.id("combo_facility"));
		Select drpdown = new Select(dropdown);

		// selecting by visible text,
		drpdown.selectByVisibleText("Seoul CURA Healthcare Center");
		
		Thread.sleep(3000);

		// selecting by value,
		drpdown.selectByValue("Hongkong CURA Healthcare Center");
		Thread.sleep(3000);

		// selecting by id,
		drpdown.selectByIndex(2);
		Thread.sleep(3000);

		// selecting a particular value, for ex: selecting a value 2nd from the last
		int size = drpdown.getOptions().size();
		drpdown.selectByIndex(size - 2);
		
		driver.findElement(By.id("radio_program_medicaid")).click();
		
		
		
		

	}

}
