package qaguru.owner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    public void testConfiguration() {
        final TestConfig config = new TestConfig();

        assertThat(config.getWebDriverUrl())
                .isEqualTo("http://localhost:4444");
        assertThat(config.getWebDriverBrowser())
                .isEqualTo("chrome");
        assertThat(config.getBaseUrl())
                .isEqualTo("https://testing.google.com/");
    }
}
