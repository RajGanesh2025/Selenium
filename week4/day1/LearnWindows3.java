package week4.day1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows3 {
//Closing all the windows except the parent window
	public static void main(String[] args) throws InterruptedException

	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		driver.findElement(By.xpath("//i[(@class='pi pi-globe layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//i[(@class='pi pi-fw pi-window-maximize layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
		Thread.sleep(2000);
		
		//Using getWindowHandle to handle parentWindow
		String parentWindow = driver.getWindowHandle();
		//System.out.println(parentWindow);
		
		//Using getWindowHandles to handle all the windows
		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println(windowHandles);
		
		
		//Using foreach loop to switch between windows
		for (String newWindow : windowHandles) {
			if (!newWindow.equals(parentWindow)) {
				driver.switchTo().window(newWindow);
				//driver.close closes the current window
				driver.close();
				//driver.quit closes the browser opened by driver.
				
			}		
		}
//		Closing all the newly opened windows
//		driver.close();
//		
//		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
	}

}
