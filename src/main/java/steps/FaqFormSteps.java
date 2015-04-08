package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.FaqForm;


public class FaqFormSteps extends ScenarioSteps {
    FaqForm faqFormPage;

    public FaqFormSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        FaqForm loginPage = getPages().get(FaqForm.class);
        loginPage.open();
    }

    @Step("Кликнул 'Контакты'")
    public void addClickContact() {
        faqFormPage.SetClickContact();
    }
    @Step("Введите 'Имя'")
    public void addNameFaq() {
        faqFormPage.SetNameFaq();
    }
    @Step("Введите 'Майл'")
    public void addMailFaq() {
        faqFormPage.SetMailFaq();
    }
    @Step("Введите 'Сообщение'")
    public void addMsgFaq() {
        faqFormPage.SetMsgFaq();
    }

    @Step("Кликнул 'Отправить'")
    public void addButtonFaq() {
        faqFormPage.SetButtonFaq();
    }

}


