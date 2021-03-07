package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.AnimalsConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalsTest {

    @Test
    public void testAnimals() {
        final AnimalsConfig config = ConfigFactory
                .create(AnimalsConfig.class, System.getProperties());

        assertThat(config.getAnimals()).containsExactlyInAnyOrder("monkey", "fox", "bear");
    }
}
