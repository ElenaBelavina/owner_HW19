package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${driver}.properties")
public interface
DriverConfig extends Config {
    @Key("browser.name")
    @DefaultValue("edge")
    String browserName();
    @Key("browser.version")
    @DefaultValue("124.0.2478.80")
    String browserVersion();
    @Key("browser.size")
    @DefaultValue("1920x1080")
    String browserSize();
    @Key("browser.remote.url")
    String browserRemoteURL();
}
