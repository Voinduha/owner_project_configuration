package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.CredentialsConfig;
import qaguru.owner.config.MobileConfig;

public class CredentialsTest {

    @Test
    public void testCredentials() {
        final CredentialsConfig config = ConfigFactory
                .create(CredentialsConfig.class, System.getProperties());

        System.out.println(config.username());
        System.out.println(config.password());

    }
}
