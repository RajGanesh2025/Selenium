package week4.day1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException

	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		driver.findElement(By.xpath("//i[(@class='pi pi-globe layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//i[(@class='pi pi-fw pi-window-maximize layout-menuitem-icon')]")).click();
		driver.findElement(By.id("j_idt88:new")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//getwindowhandle method is for parent window
		String parentWindow = driver.getWindowHandle();
		
		//getWindowHandles is for handling all the windows
		Set<String> windowHandles = driver.getWindowHandles();
		
		//to switch control from parent window to new window, we use foreach(type foreach) loop
		for (String newWindow : windowHandles) {
			driver.switchTo().window(newWindow);			
		}
		
		//Now the control is transferred from old to new window
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email']"));
		emailAddress.sendKeys("raj.ganesh@testleaf.com");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
