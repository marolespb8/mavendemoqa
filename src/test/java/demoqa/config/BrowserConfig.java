package demoqa.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:demoqa/config/BrowserConfig.java" })

public interface BrowserConfig {


    public interface ServerConfig extends Config {
        @Key("server.http.port")
        int port();

        @Key("server.host.name")
        String hostname();

        //@Key("server.max.threads");
        @DefaultValue("42")
        int maxThreads();
    }
}
