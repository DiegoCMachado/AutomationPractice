package Tasks;

import PageObjects.AddressPage;
import org.openqa.selenium.WebDriver;

public class AddressTask {

    private WebDriver driver;
    private AddressPage addressPage;

    public AddressTask(WebDriver driver) {
        this.driver = driver;
        addressPage = new AddressPage(driver);
    }

    public void checkoutButton(){
        addressPage.checkoutButton().click();
    }
}
