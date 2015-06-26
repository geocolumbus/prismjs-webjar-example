package com.tallgeorge.color;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

/**
 * Entry point for the Spring Boot application.
 */
@SpringBootApplication
public class ColorApplication extends SpringBootServletInitializer {

    /**
     * Set the Spring Application Builder's sources manually.
     * @param application an application, this application.
     * @return application sources, this application's sources.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ColorApplication.class);
    }

    /**
     * Start the Spring Boot application.
     * @param args an array of strings, the command line arguments.
     */
    public static void main(final String[] args) {
        ApplicationContext ctx = SpringApplication.run(ColorApplication.class, args);
    }
}
