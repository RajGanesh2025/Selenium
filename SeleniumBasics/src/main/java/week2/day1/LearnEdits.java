package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnEdits {

	public static void main(String[] args) {

		// Step1: setup the driver (BUT THIS IS NOT NECESSARY FOR THE LATEST VERSION)
		// WebDriver.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/input.xhtml");

		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.id("j_idt88:name"));

		name.sendKeys("Raj Ganesh", Keys.TAB);

		WebElement country = driver.findElement(By.id("j_idt88:j_idt91"));

		country.sendKeys("Chennai");

		country.sendKeys(" TamilNadu", Keys.TAB);

		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		// WebElement typetext = driver.findElement(By.id("j_idt88:j_idt97"));
		// typetext.getDomAttribute("value");

	}

}
