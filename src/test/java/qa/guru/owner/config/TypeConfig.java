package qa.guru.owner.config;

import org.aeonbits.owner.Config;

public interface TypeConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("bouble")
    Double getDouble();

    @Key("doolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();
}
