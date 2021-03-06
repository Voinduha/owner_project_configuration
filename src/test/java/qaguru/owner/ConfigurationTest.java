package qaguru.owner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    public void testConfiguration() {
        final String localWebDriverUrl = "http://localhost:4444";
        final String companyWebDriverUrl = "https://selenoid.company.com:4444";
        final String webDriverBrowserChrome = "chrome";
        final String webDriverBrowserFireFox = "firefox";

        final String baseUrlTesting = "https://testing.google.com/";
        final String baseUrlDev = "https://testing.google.com/";

        assertThat(localWebDriverUrl).isEqualTo("http://localhost:4444");
        assertThat(webDriverBrowserChrome).isEqualTo("chrome");
        assertThat(baseUrlTesting).isEqualTo("https://testing.google.com/");
    }
}
