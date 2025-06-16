package week4.day1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows2 {
//Getting the number of windows
	public static void main(String[] args) throws InterruptedException

	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		driver.findElement(By.xpath("//i[(@class='pi pi-globe layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//i[(@class='pi pi-fw pi-window-maximize layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		//Use getWindowHandles to find the total number of windows/tab opened
		Set<String> windowHandles = driver.getWindowHandles();
		
		//To get the number of windows, use getwindows+size and the Ctrl+2,L
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("The number of opened tabs/windows is:" + numberOfWindows );
	}

}
