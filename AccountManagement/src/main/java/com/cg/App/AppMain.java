package com.cg.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableAutoConfiguration
@PropertySource("classpath:application.properties")
public class AppMain
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AppMain.class, args);
    }
}
