package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    private WebDriver driver;
    private Waits waits;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement emailText(){
        return waits.visibilityOfElement(By.id("email_create"));
    }

    public WebElement createAccount(){
        return waits.visibilityOfElement(By.id("SubmitCreate"));
    }
}
