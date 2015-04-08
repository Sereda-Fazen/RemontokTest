package tests;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class Tests extends BeforeClass {
    @ManagedPages(defaultUrl = "http://remontok.kharkov.ua/")
    public Pages pages;

    @WithTag("Сделать обратный звонок")
 @Test
    public void OneTestCall() throws InterruptedException {

        compare.addClick();
        name.addName();
        phone.addPhone();
        mail.addMail();
        msg.addMsg();
        button.addButton();
        Thread.sleep(3000);
    }
    @WithTag("Заказать обратный звонок")
 @Test
    public void TwoTestCallBack() throws InterruptedException {

        compare1.addClick1();
        name1.addName();
        phone1.addPhone();
        button1.addButton();
        compare1.addClick1();
        Thread.sleep(3000);
    }
    @WithTag("Напишите нам")
 @Test
    public void ThreeTestCallUs() throws InterruptedException {

        nameUs.addNameUs();
        mailUs.addMailUs();
        msgUs.addMsgUs();
        buttonUs.addButtonUs();

        Thread.sleep(3000);
    }
    @WithTag("Вакансии")
@Test
    public void FourTestVacancy() throws InterruptedException {

        Job.addJobClick();
        JobName.addJobName();
        JobMail.addJobMail();
        JobPhone.addJobPhone();
        JobSpecial.addJobSpecial();
        JobMsg.addJobMsg();
        JobButton.addJobButton();
        Thread.sleep(3000);
    }
    @WithTag("Поиск")
@Test
    public void FiveTestSearch() throws InterruptedException {

        clickInput.addClickInput();
        clickSearchButton.addInputButton();

        Thread.sleep(3000);
    }
    @WithTag("Вопрос-ответ")
 @Test
    public void SixTestQuestions() throws InterruptedException {

        faqContact.addClickContact();
        faqName.addNameFaq();
        faqName.addMailFaq();
        faqName.addMsgFaq();
        faqButton.addButtonFaq();

        Thread.sleep(3000);
    }




}



