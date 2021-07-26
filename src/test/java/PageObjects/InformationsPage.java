package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InformationsPage {

    private WebDriver driver;
    private Waits waits;

    public InformationsPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }
    public WebElement gender(){
        return waits.visibilityOfElement(By.id("id_gender1"));
    }

    public WebElement firstName(){
        return waits.visibilityOfElement(By.id("customer_firstname"));
    }

    public WebElement lastName(){
        return waits.visibilityOfElement(By.id("customer_lastname"));
    }

    public WebElement password(){
        return waits.visibilityOfElement(By.id("passwd"));
    }

    public WebElement address(){
        return waits.visibilityOfElement(By.id("address1"));
    }

    public WebElement city(){
        return waits.visibilityOfElement(By.id("city"));
    }

    public Select state(){
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement postcode(){
        return waits.visibilityOfElement(By.id("postcode"));
    }

    public Select country(){
        return new Select(driver.findElement(By.id("id_country")));
    }

    public WebElement phone(){
        return waits.visibilityOfElement(By.id("phone_mobile"));
    }

    public WebElement aliasaddress(){
        return waits.visibilityOfElement(By.id("alias"));
    }

    public WebElement register(){
        return waits.visibilityOfElement(By.id("submitAccount"));
    }
}
