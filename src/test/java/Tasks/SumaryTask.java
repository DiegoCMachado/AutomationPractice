package Tasks;

import PageObjects.SumaryPage;
import org.openqa.selenium.WebDriver;

public class SumaryTask {

    private WebDriver driver;
    private SumaryPage sumaryPage;

    public SumaryTask(WebDriver driver) {
        this.driver = driver;
        sumaryPage = new SumaryPage(driver);
    }

    public void checkoutButton(){
        sumaryPage.checkoutButton().click();
    }
}
