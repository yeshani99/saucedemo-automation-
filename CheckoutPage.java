package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 sec wait
    }

    public void completeCheckout() {
        WebElement firstNameInput = wait.until(ExpectedConditions.elementToBeClickable(firstName));
        firstNameInput.sendKeys("Test");

        WebElement lastNameInput = wait.until(ExpectedConditions.elementToBeClickable(lastName));
        lastNameInput.sendKeys("User");

        WebElement postalCodeInput = wait.until(ExpectedConditions.elementToBeClickable(postalCode));
        postalCodeInput.sendKeys("12345");

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueButton.click();

        WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(finishBtn));
        finishButton.click();
    }
}

