package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.CallUs;


public class CallUsSteps extends ScenarioSteps {
    CallUs callUsPage;

    public CallUsSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        CallUs loginPage = getPages().get(CallUs.class);
        loginPage.open();
    }


    @Step("Введите 'Имя'")
    public void addNameUs() {
        callUsPage.SetNameUs();
    }
    @Step("Введите 'Майл'")
    public void addMailUs() {
        callUsPage.SetMailUs();
    }
    @Step ("Введите сообщение")
    public void addMsgUs () {
        callUsPage.SetMsgUs();
    }
    @Step("Кликнул 'Отправить'")
    public void addButtonUs() {
        callUsPage.SetButtonUs();
    }

}


