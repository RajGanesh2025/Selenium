package oracle_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1 {

	public static void main(String[] args) {

		// To Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// To maximize the browser window
		driver.manage().window().maximize();
		// Going to the URL
		driver.get("https://www.google.com/");
		// To print the title, type driver.getTitle and press ctrl+2 & L, this will
		// create a variable
		String title = driver.getTitle();
		// Type syso and press ctrl+spacebar and then hit enter button
		System.out.println(title);
		// To click the about button in the page
		driver.findElement(By.className("MV3Tnb")).click();

	}

}
