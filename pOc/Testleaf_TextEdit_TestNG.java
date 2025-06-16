package pOc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Testleaf_TextEdit_TestNG {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
    }

    @Test(priority = 1)
    public void fillTextFields() {
        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt88:name")));
        name.sendKeys("James Bond", Keys.TAB);

        WebElement country = driver.findElement(By.id("j_idt88:j_idt91"));
        country.sendKeys("England", Keys.TAB);
    }

    @Test(priority = 2)
    public void verifyDisabledField() {
        WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
        boolean isEnabled = disabledBox.isEnabled();
        System.out.println("Is the field enabled? " + isEnabled);
        Assert.assertFalse(isEnabled, "The field should be disabled but it is enabled.");
    }

    @Test(priority = 3)
    public void clearAndRetrieveText() {
        WebElement clearField = driver.findElement(By.id("j_idt88:j_idt95"));
        clearField.clear();

        WebElement valueField = driver.findElement(By.id("j_idt88:j_idt97"));
        String retrievedText = valueField.getAttribute("value");
        System.out.println("Retrieved text: " + retrievedText);
        Assert.assertNotNull(retrievedText);
    }

    @Test(priority = 4)
    public void enterEmailAndMessage() {
        WebElement emailField = driver.findElement(By.id("j_idt88:j_idt99"));
        emailField.sendKeys("jamesbond@007.com", Keys.TAB);

        WebElement messageBox = driver.findElement(By.id("j_idt88:j_idt101"));
        messageBox.sendKeys("I'm an agent of the British Government.");
    }

    @Test(priority = 5)
    public void selectFontStyle() {
        WebElement fontDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ql-font']")));
        fontDropdown.click();

        WebElement monospaceOption = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ql-picker-item'][@data-value='monospace']"))
        );
        monospaceOption.click();
    }

    @Test(priority = 6)
    public void triggerValidationAndReadError() {
        WebElement enterBox = driver.findElement(By.id("j_idt106:thisform:age"));
        enterBox.sendKeys(Keys.ENTER);

        WebElement errorMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-message-error-detail']"))
        );
        String errorText = errorMessage.getText();
        System.out.println("Error Message: " + errorText);
        Assert.assertTrue(errorText.contains("Age is required"), "Error message is not as expected.");
    }

    @Test(priority = 7)
    public void handleCheckbox() {
        WebElement checkbox = driver.findElement(By.id("j_idt88:j_idt107"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        Assert.assertTrue(checkbox.isSelected(), "Checkbox is not selected.");
    }

    @Test(priority = 8)
    public void handleRadioButton() {
        WebElement radioButton = driver.findElement(By.id("j_idt88:j_idt109"));
        if (!radioButton.isSelected()) {
            radioButton.click();
        }
        Assert.assertTrue(radioButton.isSelected(), "Radio button is not selected.");
    }

    @Test(priority = 9)
    public void handleDropdown() {
        WebElement dropdown = driver.findElement(By.id("j_idt88:j_idt111"));
        dropdown.sendKeys("Option 2", Keys.TAB);
    }

    @Test(priority = 10)
    public void handleDatePicker() {
        WebElement datePicker = driver.findElement(By.id("j_idt88:j_idt113"));
        datePicker.sendKeys("2025-06-08", Keys.TAB);
    }

    @Test(priority = 11)
    public void handleTimePicker() {
        WebElement timePicker = driver.findElement(By.id("j_idt88:j_idt115"));
        timePicker.sendKeys("12:00", Keys.TAB);
    }

    @Test(priority = 12)
    public void handleSpinner() {
        WebElement spinner = driver.findElement(By.id("j_idt88:j_idt117"));
        spinner.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, Keys.TAB);
    }

    @Test(priority = 13)
    public void handleSearchField() {
        WebElement searchField = driver.findElement(By.id("j_idt88:j_idt119"));
        searchField.sendKeys("Selenium", Keys.ENTER);
    }

    @Test(priority = 14)
    public void handleUploadField() {
        WebElement uploadField = driver.findElement(By.id("j_idt88:j_idt121"));
        uploadField.sendKeys("C:\\path\\to\\file.txt");
    }

    @Test(priority = 15)
    public void handleMaskField() {
        WebElement maskField = driver.findElement(By.id("j_idt88:j_idt123"));
        maskField.sendKeys("1234567890", Keys.TAB);
    }

    @Test(priority = 16)
    public void handlePhoneField() {
        WebElement phoneField = driver.findElement(By.id("j_idt88:j_idt125"));
        phoneField.sendKeys("+1 234 567 890", Keys.TAB);
    }

    @Test(priority = 17)
    public void handleCreditCardField() {
        WebElement creditCardField = driver.findElement(By.id("j_idt88:j_idt127"));
        creditCardField.sendKeys("4111 1111 1111 1111", Keys.TAB);
    }

    @Test(priority = 18)
    public void handleColorPicker() {
        WebElement colorPicker = driver.findElement(By.id("j_idt88:j_idt129"));
        colorPicker.sendKeys("#FF5733", Keys.TAB);
    }

    @Test(priority = 19)
    public void handleRangeSlider() {
        WebElement rangeSlider = driver.findElement(By.id("j_idt88:j_idt131"));
        rangeSlider.sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.TAB);
    }

    @Test(priority = 20)
    public void handleTextarea() {
        WebElement textarea = driver.findElement(By.id("j_idt88:j_idt133"));
        textarea.sendKeys("This is a multiline input field.", Keys.TAB);
    }

    @Test(priority = 21)
    public void handleButton() {
        WebElement button = driver.findElement(By.id("j_idt88:j_idt135"));
        button.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
