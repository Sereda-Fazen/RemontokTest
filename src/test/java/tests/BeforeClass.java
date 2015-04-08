

package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page.Search;
import steps.*;


import java.io.IOException;




/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    /**
     *
     */
    @Managed(uniqueSession = true, driver = "iexplorer")

        /*Сделать обратный звонок*/

    public WebDriver driver;

    @Steps
    public FormSteps compare;
    @Steps
    public FormSteps name;
    @Steps
    public FormSteps phone;
    @Steps
    public FormSteps mail;
    @Steps
    public FormSteps msg;
    @Steps
    public FormSteps button;

    /* Заказать обратный звонок*/

    @Steps
    public CallBackSteps compare1;
    @Steps
    public CallBackSteps name1;
    @Steps
    public CallBackSteps phone1;
    @Steps
    public CallBackSteps button1;

    /* Напишите нам*/

    @Steps
    public CallUsSteps nameUs;
    @Steps
    public CallUsSteps mailUs;
    @Steps
    public CallUsSteps msgUs;
    @Steps
    public CallUsSteps buttonUs;

     /* Вакансии */

    @Steps
    public VacancySteps Job;
    @Steps
    public VacancySteps JobName;
    @Steps
    public VacancySteps JobMail;
    @Steps
    public VacancySteps JobPhone;
    @Steps
    public VacancySteps JobSpecial;
    @Steps
    public VacancySteps JobMsg;
    @Steps
    public VacancySteps JobButton;

       /* Поиск*/
    @Steps
    public SearchSteps clickInput;
    @Steps
    public SearchSteps clickSearchButton;

     /* Вопрос-Ответ*/

    @Steps
    public FaqFormSteps faqContact;
    @Steps
    public FaqFormSteps faqName;
    @Steps
    public FaqFormSteps faqMail;
    @Steps
    public FaqFormSteps faqMsg;
    @Steps
    public FaqFormSteps faqButton;




    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", "c:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\IEDriverServer.exe");
        compare.start_browser();
        driver.manage().window().maximize();
    }

    @After
    public void close() throws IOException {
        driver.close();
    }
}



