package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.CallBack;


public class CallBackSteps extends ScenarioSteps {
    CallBack callBackPage;

    public CallBackSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        CallBack loginPage = getPages().get(CallBack.class);
        loginPage.open();
    }

    @Step("Кликнул Сделать заказ онлайн")
    public void addClick1() {
        callBackPage.SetClick1();
    }
    @Step("Введите 'Имя'")
    public void addName() {
        callBackPage.SetName1();
    }
    @Step("Введите 'Телефон'")
    public void addPhone() {
        callBackPage.SetPhone1();
    }
    @Step("Кликнул 'Отправить'")
    public void addButton() {
        callBackPage.SetButton1();
    }

}


