package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageTask {
    private WebDriver driver;
    private HomePage homePage;


    public HomePageTask(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);

    }
    public void tshirt(){
        homePage.tshirt().click();
    }

    public void selectProduct(){
        homePage.productImage().click();
    }


}

