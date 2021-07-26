package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.AddressPage;
import PageObjects.InformationsPage;
import Utils.FakerGenerator;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InformationsTask {

    private WebDriver driver;
    private InformationsPage informationsPage;
    private AddressPage addressPage;

    public InformationsTask(WebDriver driver) {
        this.driver = driver;
        informationsPage = new InformationsPage(driver);
        addressPage = new AddressPage(driver);
    }

    public void gendercheck(){
        informationsPage.gender().click();
    }

    public void firstName(){
        informationsPage.firstName().sendKeys(FakerGenerator.getFirstName());
    }

    public void lastName(){
        informationsPage.lastName().sendKeys(FakerGenerator.getLastName());
    }

    public void password(){
        informationsPage.password().sendKeys(FakerGenerator.getpassword());
    }

    public void address(){
        informationsPage.address().sendKeys(FakerGenerator.getaddress());
    }

    public void city(){
        informationsPage.city().sendKeys(FakerGenerator.getCity());
    }

    public void state(){
        informationsPage.state().selectByVisibleText("Arkansas");
    }

    public void postalcode(){
        informationsPage.postcode().sendKeys(FakerGenerator.getPostalCode());
    }

    public void country(){
        informationsPage.country().selectByVisibleText("United States");
    }

    public void phone(){
        informationsPage.phone().sendKeys(FakerGenerator.phone());
    }

    public void aliasaddress(){
        informationsPage.aliasaddress().sendKeys(FakerGenerator.getaddress());
    }

    public void register(){
        informationsPage.register().click();
        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = addressPage.stepthird().getText();
            Assertions.assertEquals("03. Address", textoExtraido);
            Report.log(Status.PASS, "Endereço verificado com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Endereço não localizado!", Screenshot.fullPageBase64(driver));
        }
    }
}
