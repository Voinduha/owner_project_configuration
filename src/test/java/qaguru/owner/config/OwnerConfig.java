package qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${LocalRemote}.properties")
public interface OwnerConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browser_version")
    String browserVersion();

    @Key("remote_url")
    String remoteUrl();
}
