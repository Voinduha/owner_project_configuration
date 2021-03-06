package qaguru.owner;

public class TestConfig {
    public String getWebDriverUrl() {
        return System.getProperty("webDriverUrl");
    }

    public String getWebDriverBrowser() {
        return System.getProperty("webDriverBrowser");
    }

    public String getBaseUrl() {
        return System.getProperty("baseUrl");
    }
}
