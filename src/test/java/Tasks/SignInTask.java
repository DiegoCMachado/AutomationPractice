package Tasks;

import PageObjects.SignInPage;
import Utils.FakerGenerator;
import org.openqa.selenium.WebDriver;

public class SignInTask {

    private WebDriver driver;
    private SignInPage signInPage;

    public SignInTask(WebDriver driver) {
        this.driver = driver;
        signInPage = new SignInPage(driver);
    }

    public void emailAdress(){
        signInPage.emailText().sendKeys(FakerGenerator.getEmail());
    }

    public void createAccount(){
        signInPage.createAccount().click();
    }
}
