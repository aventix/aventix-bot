package de.aventix.bot.twitch;

import com.google.common.collect.Lists;
import de.aventix.bot.config.Config;
import de.aventix.bot.config.Configuration;
import de.aventix.bot.config.JsonConfigurationType;
import lombok.Getter;
import lombok.Setter;

import javax.inject.Singleton;

@Getter
@Setter
@Singleton
@Configuration(filename = "twitch", type = JsonConfigurationType.class)
public class TwitchConfig extends Config {
    private String clientId = "clientId";
    private String secretKey = "secretKey";
    private String chatToken = "IRC_CHAT_TOKEN";
    private String redirectUrl = "redirectUrl";
    private TwitchConfigEntry config = new TwitchConfigEntry();
}
