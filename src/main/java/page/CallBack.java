package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Dima on 03.03.2015.
 */
public class CallBack extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    @FindBy(linkText = "Заказать обратный звонок")
    private WebElement clickCallBack;
    @FindBy(name = "name1")
    private WebElement addName1;
    @FindBy(name = "phone1")
    private WebElement addPhone1;

    @FindBy(name = "callback-form")
    private WebElement clickButton1;

    public CallBack(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void SetClick1() {
        clickOn(clickCallBack);
    }
    public void SetName1() {
        enter("Alexander(test name)").into(addName1);
    }
    public void SetPhone1() {
        enter("+38 093-966-12-89").into(addPhone1);
    }


    public void SetButton1() {
        clickOn(clickButton1);
        assertTrue(element(clickButton1).isPresent());
        assertTrue("Error input callback form",element(clickButton1).isPresent());
    }

}
