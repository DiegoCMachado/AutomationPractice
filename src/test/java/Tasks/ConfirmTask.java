package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CompletePage;
import PageObjects.ConfirmPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ConfirmTask {

    private WebDriver driver;
    private ConfirmPage confirmPage;
    private CompletePage completePage;

    public ConfirmTask(WebDriver driver) {
        this.driver = driver;
        confirmPage = new ConfirmPage(driver);
        completePage = new CompletePage(driver);
    }

    public void confirmButton(){
        confirmPage.confirmButton().click();
        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = completePage.backToOrder().getText();
            Assertions.assertEquals("Back to orders", textoExtraido);
            Report.log(Status.PASS, "Pedido finalizado com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Pedido não finalizado!", Screenshot.fullPageBase64(driver));
        }
    }
}
