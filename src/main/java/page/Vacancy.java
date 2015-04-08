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
public class Vacancy extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    @FindBy(linkText = "Вакансии")
    private WebElement clickCallVacancy;
    @FindBy(name = "namejob")
    private WebElement addJobName;
    @FindBy(name = "emailjob")
    private WebElement addJobMail;
    @FindBy(name = "phonejob")
    private WebElement addJobPhone;
    @FindBy(name = "specialjob")
    private WebElement addJobSpecial;
    @FindBy(name = "messagejob")
    private WebElement addJobMsg;



    @FindBy(name = "jobs-form")
    private WebElement clickJobButton;



    public Vacancy(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void SetJobClick() {
        clickOn(clickCallVacancy);
    }
    public void SetJobName() {
        enter("Alexander(test name)").into(addJobName);
    }
    public void SetJobMail() {
        enter("fazen7@mail.ru").into(addJobMail);
    }
    public void SetJobPhone() {
        enter("+38 093-966-12-89").into(addJobPhone);
    }
    public void SetJobSpecial() {
        enter("Santehhik").into(addJobSpecial);
    }
    public void SetJobMsg() {
        enter("Test case").into(addJobMsg);
    }


    public void SetJobButton() {
        clickOn(clickJobButton);
        assertTrue(element(clickJobButton).isPresent());
        assertFalse("Error input CA in job", element(clickJobButton).isPresent());
    }

}
