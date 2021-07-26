package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SumaryPage {

    private WebDriver driver;
    private Waits waits;

    public SumaryPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement checkoutButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id='center_column']/p[2]/a[1]"));
    }

    public WebElement totalPrice(){
        return waits.visibilityOfElement(By.id("total_price"));
    }
}
