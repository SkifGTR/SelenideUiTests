package Pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchResultsPage {
    private static final ElementsCollection searchResultsSet = $$x("//a[contains(@href,'apple-iphone-16-')]");

    public String getFirstResultFromSearchList() {
        return searchResultsSet.first().getAttribute("href");
    }
}
