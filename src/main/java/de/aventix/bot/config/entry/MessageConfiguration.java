package de.aventix.bot.config.entry;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;
import de.aventix.bot.config.Config;
import de.aventix.bot.config.Configuration;
import de.aventix.bot.message.EmbededMessageEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/* This class was created by @Aventix on 06.06.2022 at 13:05. */

@Getter
@Setter
@Singleton
@Configuration(filename = "messages")
public class MessageConfiguration extends Config {
    private List<GuildMessageConfiguration> guilds = Lists.newArrayList(new GuildMessageConfiguration());
}
