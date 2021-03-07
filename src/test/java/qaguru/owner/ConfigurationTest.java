package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.TestConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    public void testConfiguration() {
        final TestConfig config = ConfigFactory.create(TestConfig.class, System.getProperties());

        assertThat(config.getWebDriverUrl())
                .isEqualTo("http://localhost:4444");
        assertThat(config.getWebDriverBrowser())
                .isEqualTo("chrome");
        assertThat(config.isEnabled())
                .isEqualTo(true);
    }
}
