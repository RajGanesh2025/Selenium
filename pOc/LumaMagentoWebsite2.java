package pOc;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LumaMagentoWebsite2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//Launching website
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Wait
		Thread.sleep(1000);
		
		//Getting Luma website
		driver.get("https://magento.softwaretestingboard.com/");
		
		//Signing in
		driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();
		Thread.sleep(1000);
		
		//Finding Email field
		WebElement enterEmailField = driver.findElement(By.xpath("//input[@name='login[username]']"));
				
		//Entering email address
		enterEmailField.sendKeys("testrun3@gmail.com");
		
		//Finding password field
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='login[password]']"));
				
		//Entering password
		passwordField.sendKeys("123@testing");
		
		//Find Signin button
		WebElement SignIn = driver.findElement(By.xpath("//button[@class='action login primary']"));
		Thread.sleep(1000);
		SignIn.click();
		
		//Wait for the website to load
		Thread.sleep(3000);
		
		
		//Select Gear button
		WebElement gearButton = driver.findElement(By.xpath("//span[contains(text(), 'Gear')]"));
		gearButton.click();
		
		Thread.sleep(3000);
		//Select the watches button
		WebElement watchesButton = driver.findElement(By.xpath("//a[contains(text(), 'Watches')]"));
		watchesButton.click();
		
		Thread.sleep(1000);
		//Select Clamberwatch
		WebElement clamberWatch = driver.findElement(By.xpath("//a[@class='product-item-link' and contains(text(), 'Clamber Watch')]"));
		clamberWatch.click();
		
		//Adding to cart
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);
		
		//Locating the success message
		WebElement successMessage = driver.findElement(By.xpath("//div[@class='message-success success message']"));
		
		//Retrieving the success message
		String succssMsg = successMessage.getText();
		System.out.println(succssMsg);
		
		//Click the Cart button
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		Thread.sleep(1000);
		
		//Click proceed to checkout
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@class='shipping-address-item selected-item']")).click();
		
		//Shipping address page
		//Entering firstname
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.clear();
		firstName.sendKeys("James");
		Thread.sleep(1000);
		
		//Entering lastname
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.clear();
		lastName.sendKeys("Bond");
		Thread.sleep(1000);
		
		//Entering Company Name
		WebElement companyName = driver.findElement(By.xpath("//input[@name='company']"));
		companyName.sendKeys("American Intelligence");
		Thread.sleep(1000);
		
		//Entering Street address
		WebElement streetAddress = driver.findElement(By.xpath("//input[@name='street[0]']"));
		streetAddress.sendKeys("No:7, Royal Street");
		Thread.sleep(1000);
		
		//Entering Street address2
		WebElement streetAddress1 = driver.findElement(By.xpath("//input[@name='street[1]']"));
		streetAddress1.sendKeys("Broadway");
		Thread.sleep(1000);
		
		//Entering City
		WebElement cityName = driver.findElement(By.xpath("//input[@name='city']"));
		cityName.sendKeys("New York");
		Thread.sleep(1000);
		
		//Selecting State dropdown
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@name='region_id']"));
		Select dropdown = new Select(stateDropdown);
		dropdown.selectByVisibleText("New York");
		Thread.sleep(1000);
		
		//Entering postcode
		WebElement postCode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postCode.sendKeys("10001");
		Thread.sleep(1000);
		
		//Entering phone number
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='telephone']"));
		phoneNumber.sendKeys("8222913984");
		
		//Selecting shipping methods
		WebElement shippingMethod = driver.findElement(By.xpath("//input[@name='ko_unique_1']"));
		shippingMethod.click();
		
		//Clicking Next button
		WebElement nextButton = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		nextButton.click();
		Thread.sleep(3000);
		
		//Selecting place order button in the next page
		WebElement placeOrderButton = driver.findElement(By.xpath("//button[@class='action primary checkout']"));
		placeOrderButton.click();
		Thread.sleep(4000);
		
				
		//Getting the order confirmation/thankyou message
		WebElement thankYouNote = driver.findElement(By.xpath("//span[@class='base']"));
		String thanks = thankYouNote.getText();
		System.out.println(thanks);
		
		//Getting the order number
		WebElement orderNumber = driver.findElement(By.xpath("//a[@class='order-number']"));
		String number = orderNumber.getText();
		System.out.println("Your order number is "+ number);
		
		
		Thread.sleep(3000);
		driver.close();
		
			
		
	}

}
