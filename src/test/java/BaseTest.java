import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import utils.ConfigLoader;

abstract public class BaseTest {
    private static final String browser = new ConfigLoader().getProperty("browser");

    public void setUp() {
        String browser = System.getProperty("browser", this.browser);

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
            configurationSet();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            Configuration.browser = "firefox";
            configurationSet();
        } else if (browser.equals("safari")) {
            WebDriverManager.firefoxdriver().setup();
            Configuration.browser = "safari";
            configurationSet();
        } else {
            throw new IllegalArgumentException("Browser " + browser + " not supported");
        }

    }

    @BeforeEach
    public void run() {
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    private static void configurationSet() {
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.proxyEnabled = false;
    }
}
