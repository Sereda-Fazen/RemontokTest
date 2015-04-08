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
public class CallUs extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    @FindBy(name = "name")
    private WebElement addNameUs;
    @FindBy(name = "email")
    private WebElement addMailUs;
    @FindBy(name = "message")
    private WebElement addMsgUs;

    @FindBy(name = "contact-form")
    private WebElement clickButtonUs;



    public CallUs(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void SetNameUs() {
        enter("Alexander(test name)").into(addNameUs);
    }
    public void SetMailUs() {
        enter("fazen@mail.ru").into(addMailUs);
    }
    public void SetMsgUs() {
        enter("Test case").into(addMsgUs);
    }


    public void SetButtonUs() {
        clickOn(clickButtonUs);
        assertTrue(element(clickButtonUs).isPresent());
        assertFalse("Error input form - call us",element(clickButtonUs).isPresent());
    }

}
