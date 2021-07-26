package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CategoryPage;
import PageObjects.SumaryPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CategoryTask {
    private WebDriver driver;
    private CategoryPage categoryPage;
    private SumaryPage sumaryPage;


    public CategoryTask(WebDriver driver) {
        this.driver = driver;
        categoryPage = new CategoryPage(driver);
        sumaryPage = new SumaryPage(driver);


    }

    public void getItem() {
        categoryPage.itemName().click();
    }

    public void cartButton() {
        categoryPage.cartButton().click();
    }

    public void checkoutButton() {
        categoryPage.checkoutButton().click();
        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = sumaryPage.totalPrice().getText();
            Assertions.assertEquals("$18.51", textoExtraido);
            Report.log(Status.PASS, "Item adicionado ao carrinho com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Item não localizado!", Screenshot.fullPageBase64(driver));
        }
    }
}