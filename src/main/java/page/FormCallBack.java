package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Dima on 03.03.2015.
 */
public class FormCallBack extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    @FindBy(linkText = "Сделать заказ онлайн")
    private WebElement clickCall;
    @FindBy(name = "name2")
    private WebElement addName;
    @FindBy(name = "phone2")
    private WebElement addPhone;
    @FindBy(name = "email2")
    private WebElement addMail;
    @FindBy(name = "message2")
    private WebElement addMsg;

    @FindBy(name = "order-form")
    private WebElement clickButton;


    public FormCallBack(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }
    public void SetClick() {
        clickOn(clickCall);
    }
    public void SetName() {
        enter("Alexander").into(addName);
    }
    public void SetPhone() {
        enter("+38 093-966-12-89").into(addPhone);
    }
    public void SetMail() {
        enter("cud@mail.ru").into(addMail);
    }
    public void SetMsg() {
        enter("This test word").into(addMsg);
    }

    public void SetButton() {
        clickOn(clickButton);
        assertTrue(element(clickButton).isPresent());
        assertFalse("Error input form",element(clickButton).isPresent());
    }



}
