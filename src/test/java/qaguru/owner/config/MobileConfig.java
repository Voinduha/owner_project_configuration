package qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:ios.properties")
public interface MobileConfig extends Config {

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("application.Location")
    String applicationLocation();

}
