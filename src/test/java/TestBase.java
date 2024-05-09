
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.DriverConfig;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void browserConfig() {
        DriverConfig driverConfig = ConfigFactory.create(DriverConfig.class);

        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = driverConfig.browserName();
        Configuration.browserVersion=driverConfig.browserVersion();
        Configuration.browserSize=driverConfig.browserSize();
        Configuration.remote=driverConfig.browserRemoteURL();
      }

    @AfterEach
    void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}