package pageObjectsAndActions;

import base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectsPage extends BaseClass {

    @FindBy(id = "search-toggle")
    public WebElement searchBtn;
    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cookiesBtn;


    @FindBy(xpath = "//*[@id='content']/div[7]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/button")
    public WebElement signUpBtn;

    @FindBy(xpath = "//*[@id='content']/div[7]/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[1]/text-input/div/div[1]/input")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id='content']/div[7]/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[2]/text-input/div/div[1]/input")
    public WebElement surNameInput;

    @FindBy(xpath = "//*[@id='content']/div[7]/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/form/div[1]/section/fieldset[2]/div[3]/text-input/div/div[1]/input")
    public WebElement emailInput;

    @FindBy(xpath = "(//*[@class='checkbox-input__button-copy ng-binding'])[1]")
    public WebElement myselfChkBox;
    @FindBy(xpath = "(//*[@class='checkbox-input__button-copy ng-binding'])[2]")
    public WebElement intermediariesChkBox;

    @FindBy(xpath = "(//*[@class='checkbox-input__button-copy ng-binding'])[3]")
    public WebElement myBusinessChkBox;

    @FindBy(xpath = "//*[@class='forms__submit cta-primary']")
    public WebElement submitBtn;


    @FindBy(className = "thank-you__heading")
    public WebElement successMsg;


    public ObjectsPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnSearchButton() throws InterruptedException {
        cookiesBtn.click();
        searchBtn.click();
        System.out.println("Clicked on search button");
            }
    public void clickSignUpButton() throws InterruptedException {
        signUpBtn.click();
        System.out.println("Clicked on signup button");
    }

    public void captureName(String uname) throws InterruptedException {
        Thread.sleep(1000);
        nameInput.click();
        nameInput.sendKeys(uname);
        System.out.println("Captured surname");
    }

    public void captureSurname(String surname) {
        surNameInput.click();
        surNameInput.sendKeys(surname);
        System.out.println("Captured surname");
    }

    public void captureEmail(String email) throws InterruptedException {
        emailInput.click();
        emailInput.sendKeys(email);
        System.out.println("Captured email address");
    }
    public void clickOnMySelfCheckBox() {
        myselfChkBox.click();
        System.out.println("Clicked on my self check box");
    }
    public void clickIntermediariesCheckBox() {
        intermediariesChkBox.click();
        System.out.println("Clicked on intermediaries check box");
    }
    public void clickOnMyBusinessCheckBox() {
        myBusinessChkBox.click();
        System.out.println("Clicked on my business check box");
    }

    public void clickOnSubmitButton() {
        submitBtn.click();
        System.out.println("Clicked submit button");
    }

    public void successMessageDisplayed() {
        successMsg.isDisplayed();
        System.out.println("SuccessMessage Displayed");

    }
}
