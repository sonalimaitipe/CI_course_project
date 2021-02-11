package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By enrollButton = By.xpath("//a[@class='btn btn-warning btn-lg heroRegisterBtn animated fadeInLeft delay-2s']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickEnrollButton() {
        driver.findElement(enrollButton).click();
        return new LoginPage(driver);
    }
}
