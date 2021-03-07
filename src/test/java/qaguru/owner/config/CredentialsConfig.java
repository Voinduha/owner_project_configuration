package qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:credentials.properties",
        "file:/User/DanVu/credentials.properties",
})
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface CredentialsConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();


}
