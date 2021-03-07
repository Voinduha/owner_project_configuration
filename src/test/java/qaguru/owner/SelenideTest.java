package qaguru.owner;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.SelenoideConfig;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @BeforeEach
    public void initBrowser() {
        final SelenoideConfig config = ConfigFactory
                .create(SelenoideConfig.class, System.getProperties());
        Configuration.browser = config.browser();
    }

    @Test
    public void testOpenPage() {
        open("https://github.com");
        //additional test
    }

    @Test
    public void testSecondPage() {
        open("https://github.com");
        //additional test
    }
}
