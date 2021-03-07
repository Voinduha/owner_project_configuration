package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import qaguru.owner.config.ProxyConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProxyTest {

    public void testProxy() {

        final ProxyConfig config = ConfigFactory
                .create(ProxyConfig.class, System.getProperties());

        assertThat(config.host()).isEqualTo("proxy.company.com");
        assertThat(config.port()).isEqualTo("4444");
        assertThat(config.enabled()).isEqualTo("true");
    }
}
