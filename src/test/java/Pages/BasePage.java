package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    private final SelenideElement searchField = $x("//form/input[@type='search']");

    public BasePage(String marketplaceUrl) {
        Selenide.open(marketplaceUrl);
    }

    public SearchResultsPage searchForProduct(String searchQuery) {
        searchField.click();
        searchField.setValue(searchQuery);
        searchField.pressEnter();
        return new SearchResultsPage();
    }
}
