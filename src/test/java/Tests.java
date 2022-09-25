import base.BaseClass;
import org.junit.Test;
import pageObjectsAndActions.ObjectsPage;

public class Tests extends BaseClass {

    @Test

    public void signUP() throws InterruptedException {

        ObjectsPage op = new ObjectsPage(driver);
        driver.navigate().to("https://www.investec.com/");
        op.clickOnSearchButton();
        driver.navigate().to("https://www.investec.com/en_za/focus/money/understanding-interest-rates.html");
        op.clickSignUpButton();
        op.captureName("Phanee");
        op.captureSurname("Thota");
        op.captureEmail("test@investec.co.za");
        op.clickOnMySelfCheckBox();
        op.clickIntermediariesCheckBox();
        op.clickOnMyBusinessCheckBox();
        op.clickOnSubmitButton();
        op.successMessageDisplayed();
    }


}
