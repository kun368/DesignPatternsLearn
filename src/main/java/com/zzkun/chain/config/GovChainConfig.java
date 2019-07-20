package com.zzkun.chain.config;

import com.zzkun.chain.handler.GovHandler;
import com.zzkun.chain.handler.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GovChainConfig {

    @Bean(name = "govClient")
    public GovHandler getGovClient() {
        return getMayorHandler();
    }

    @Bean
    public MayorHandler getMayorHandler() {
        return new MayorHandler(getGovernorHandler());
    }

    @Bean
    public GovernorHandler getGovernorHandler() {
        return new GovernorHandler(getMinisterHandler());
    }

    @Bean
    public MinisterHandler getMinisterHandler() {
        return new MinisterHandler(null);
    }
}
