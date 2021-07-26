package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {

    private WebDriver driver;
    private Waits waits;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement itemName(){
        return waits.visibilityOfElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a"));
    }

    public WebElement cartButton(){
        return waits.visibilityOfElement(By.name("Submit"));
    }

    public WebElement checkoutButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
    }


}