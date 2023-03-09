package configuration;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:properties/${env}.properties"
})
public interface Iproperties extends Config{
    @Config.Key("urlGmail")
    String urlGmail();

    @Config.Key("userGmail")
    String userGmail();

    @Config.Key("passGmail")
    String passGmail();

    @Config.Key("urlEbay")
    String urlEbay();

    @Config.Key("passGmailIncorrecto")
    String passGmailIncorrecto();

    @Config.Key("userGmailIncorrecto")
    String userGmailIncorrecto();

    @Config.Key("urlApi")
    String urlApi();

    @Config.Key("pathApi")
    String pathApi();
}