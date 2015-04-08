package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Vacancy;


public class VacancySteps extends ScenarioSteps {
    Vacancy vacancyPage;

    public VacancySteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Vacancy loginPage = getPages().get(Vacancy.class);
        loginPage.open();
    }

    @Step("Кликнул Вакансии")
    public void addJobClick() {
        vacancyPage.SetJobClick();
    }
    @Step("Введите 'Имя'")
    public void addJobName() {
        vacancyPage.SetJobName();
    }
    @Step("Введите 'Майл'")
       public void addJobMail() {
        vacancyPage.SetJobMail();
    }
    @Step("Введите 'Телефон'")
    public void addJobPhone() {
        vacancyPage.SetJobPhone();
    }
    @Step("Введите 'Специальность'")
    public void addJobSpecial() {
        vacancyPage.SetJobSpecial();
    }
    @Step("Введите 'Сообщение'")
    public void addJobMsg() {
        vacancyPage.SetJobMsg();
    }
    @Step("Кликнул 'Отправить'")
    public void addJobButton() {
        vacancyPage.SetJobButton();
    }

}


