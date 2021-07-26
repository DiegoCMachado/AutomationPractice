package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage{

    private WebDriver driver;
    private Waits waits;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement payment(){
        return waits.visibilityOfElement(By.className("bankwire"));
    }

    public WebElement totalPrice(){
        return waits.visibilityOfElement(By.id("total_price"));
    }
}
