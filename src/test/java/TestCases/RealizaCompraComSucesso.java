package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import PageObjects.ConfirmPage;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private WebDriver driver = getDriver();


    private HomePageTask homePageTask = new HomePageTask(driver);
    private CategoryTask categoryTask = new CategoryTask(driver);
    private SumaryTask sumaryTask = new SumaryTask(driver);
    private SignInTask signInTask = new SignInTask(driver);
    private InformationsTask informationsTask = new InformationsTask(driver);
    private AddressTask addressTask = new AddressTask(driver);
    private ShippingTask shippingTask = new ShippingTask(driver);
    private PaymentTask paymentTask = new PaymentTask(driver);
    private ConfirmTask confirmTask = new ConfirmTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        try {
            Report.createTest("Realizar Compra Com Sucesso!", ReportType.SINGLE);

            homePageTask.tshirt();
            categoryTask.getItem();
            categoryTask.cartButton();
            categoryTask.checkoutButton();
            sumaryTask.checkoutButton();
            signInTask.emailAdress();
            signInTask.createAccount();
            informationsTask.gendercheck();
            informationsTask.firstName();
            informationsTask.lastName();
            informationsTask.password();
            informationsTask.address();
            informationsTask.city();
            informationsTask.state();
            informationsTask.postalcode();
            informationsTask.country();
            informationsTask.phone();
            informationsTask.aliasaddress();
            informationsTask.register();
            addressTask.checkoutButton();
            shippingTask.agreeBox();
            shippingTask.checkoutButton();
            paymentTask.payment();
            confirmTask.confirmButton();

        }catch (Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }
}
