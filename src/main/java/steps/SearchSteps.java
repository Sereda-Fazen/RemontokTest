package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Search;


public class SearchSteps extends ScenarioSteps {
    Search searchPage;

    public SearchSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Search loginPage = getPages().get(Search.class);
        loginPage.open();
    }


    @Step("Ввел текст в поиск")
    public void addClickInput() {
        searchPage.SetInput();
    }
    @Step("Кликнул ENTER")
    public void addInputButton() {
        searchPage.SetClickButton();
    }

}


