package com.sof.webadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.sof"})
@EntityScan(basePackages = {"com.sof"})
@EnableJpaRepositories(basePackages = {"com.sof"})
public class AppLauncher {

    public static void main(String args[]) throws Exception {
        SpringApplication.run(AppLauncher.class, args);
    }

}