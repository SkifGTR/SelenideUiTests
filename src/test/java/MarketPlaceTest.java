import Pages.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ConfigLoader;

public class MarketPlaceTest extends BaseTest {
    private static final String URL = new ConfigLoader().getProperty("marketplace.url");
    private static final String searchQuery = "iPhone 16 pro";

    @Test
    public void findProductOnMarketPlace() {
        String link = new BasePage(URL).searchForProduct(searchQuery).getFirstResultFromSearchList();
        Assertions.assertTrue(link.contains("iphone-16-pro"));
    }
}
