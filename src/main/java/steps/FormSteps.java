package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.FormCallBack;


public class FormSteps extends ScenarioSteps {
    FormCallBack formPage;

    public FormSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        FormCallBack loginPage = getPages().get(FormCallBack.class);
        loginPage.open();
    }

    @Step("Кликнул Сделать заказ онлайн")
    public void addClick() {
        formPage.SetClick();
    }
    @Step("Введите 'Имя'")
    public void addName() {
        formPage.SetName();
    }
    @Step("Введите 'Телефон'")
    public void addPhone() {
        formPage.SetPhone();
    }
    @Step("Введите 'Майл'")
    public void addMail() {
        formPage.SetMail();
    }
    @Step("Введите 'Сообщение'")
    public void addMsg() {
        formPage.SetMsg();
    }

    @Step("Кликнул 'Отправить'")
    public void addButton() {
        formPage.SetButton();
    }

}


