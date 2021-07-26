package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage {

    private WebDriver driver;
    private Waits waits;

    public CompletePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement backToOrder(){
        return waits.visibilityOfElement(By.xpath("//*[@id='center_column']/p/a"));
    }
}
