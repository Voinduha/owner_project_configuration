package qaguru.owner.config;

import org.aeonbits.owner.Config;

public interface ReturnTypeConfig extends Config {

    @Key("double")
    double getDouble();

    @Key("int")
    int getInt();

    @Key("string")
    String getString();

    @Key("long")
    long getLong();
}
