package Tasks;


import Framework.Report;
import Framework.Screenshot;
import PageObjects.PaymentPage;
import PageObjects.ShippingPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShippingTask {

    private WebDriver driver;
    private ShippingPage shippingPage;
    private PaymentPage paymentPage;

    public ShippingTask(WebDriver driver) {
        this.driver = driver;
        shippingPage = new ShippingPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    public void agreeBox(){
        shippingPage.agreeBox().click();
    }

    public void checkoutButton(){
        shippingPage.checkoutButton().click();
        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = paymentPage.totalPrice().getText();
            Assertions.assertEquals("$18.51", textoExtraido);
            Report.log(Status.PASS, "Valor validado com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Valor incorreto!", Screenshot.fullPageBase64(driver));
        }
    }
}
