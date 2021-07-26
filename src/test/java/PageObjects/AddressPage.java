package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage {

    private WebDriver driver;
    private Waits waits;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement checkoutButton(){
        return waits.visibilityOfElement(By.name("processAddress"));
    }

    public WebElement stepthird(){
        return waits.visibilityOfElement(By.xpath("//*[@id='order_step']/li[3]"));
    }
}
