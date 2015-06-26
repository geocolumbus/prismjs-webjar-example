package com.tallgeorge.color.config;

import com.tallgeorge.color.strategy.SelectCodeBeautifier;
import com.tallgeorge.color.strategy.SelectCodeBeautifierByContentType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Wire the application classes together.
 */
@Configuration
public class AppConfiguration {

    /**
     * Register the code beautifier bean
     * @return the code beautifier class
     */
    @Bean
    public SelectCodeBeautifier selectCodeBeautifier() {
        return new SelectCodeBeautifierByContentType();
    }
}
