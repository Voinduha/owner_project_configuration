package qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface AnimalsConfig extends Config {

    @Key("animals")
    @Separator(",")
    @DefaultValue("monkey,fox,bear")
    List<String> getAnimals();
}
