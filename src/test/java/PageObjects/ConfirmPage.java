package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmPage {
    public WebDriver driver;
    public Waits waits;

    public ConfirmPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement confirmButton(){
        return driver.findElement(By.xpath("//*[@id='cart_navigation']/button"));
    }

}
