package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Dima on 03.03.2015.
 */
public class Search extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    @FindBy(className = "search")
    private WebElement clickInput;
    //Assert
    @FindBy(className = "sisea-results")
    private WebElement assertTrue;
    @FindBy(className = "main")
    private WebElement assertFalse;



    public Search(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void SetInput() {
        enter("Золотая рыбка").into(clickInput);
    }

    public void SetClickButton() {
        Actions builder = new Actions(getDriver());
        builder.sendKeys(Keys.chord(Keys.ENTER, "")).perform();
        if (assertFalse == null) {
            assertEquals(false, element(assertFalse).isPresent());
        } else {
            assertEquals(true, element(assertTrue).isPresent());
        }
    }
}



