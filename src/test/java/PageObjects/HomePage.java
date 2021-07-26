package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;
    private Waits waits;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement tshirt(){
        return waits.visibilityOfElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
    }

    public WebElement productImage(){
        return waits.visibilityOfElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"));
    }

    public WebElement producttitle(){
        return waits.visibilityOfElement(By.cssSelector("a[title='Faded Short Sleeve T-shirts']"));
    }


}
