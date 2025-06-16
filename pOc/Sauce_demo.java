package pOc;

import java.lang.module.Configuration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Sauce_demo {

	public static void main(String[] args) {

		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false); 
		options.setExperimentalOption("prefs", prefs);
		//Configuration.browserCapabilities = options;
		

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//div[contains (text(), 'Sauce Labs Backpack')]")).click();
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		driver.findElement(By.xpath("//div//button[@class='btn_primary btn_inventory']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

	}

}
