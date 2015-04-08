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
public class FaqForm extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    @FindBy(linkText = "Вопрос-ответ")
    private WebElement clickContact;
    @FindBy(name = "name-faq")
    private WebElement addNameFaq;
    @FindBy(name = "email-faq")
    private WebElement addMailFaq;
    @FindBy(name = "message-faq")
    private WebElement addMsgFaq;

    @FindBy(name = "faq-from")
    private WebElement clickButtonFaq;



    public FaqForm (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }
    public void SetClickContact() {
        clickOn(clickContact);
    }
    public void SetNameFaq() {
        enter("Alexander").into(addNameFaq);
    }
    public void SetMailFaq() {
        enter("cud@mail.ru").into(addMailFaq);
    }
    public void SetMsgFaq() {
        enter("This test word").into(addMsgFaq);
    }
    public void SetButtonFaq() {
        clickOn(clickButtonFaq);
        assertTrue(element(clickButtonFaq).isPresent());
        assertFalse("Error",element(clickButtonFaq).isPresent());

    }



}

