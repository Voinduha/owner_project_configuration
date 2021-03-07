package qaguru.owner.config;


import org.aeonbits.owner.Config;

public interface TestConfig extends Config {

    @Key("webDriverUrl")
    String getWebDriverUrl();

    @Key("webDriverBrowser")
    String getWebDriverBrowser();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("enabled")
    boolean isEnabled();
    }

