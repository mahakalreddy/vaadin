package com.pruthvi.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.pruthvi"})
//@EnableJpaRepositories({"com.pruthvi"})
//@EntityScan({"com.pruthvi"})
public class SpringBootApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
}
