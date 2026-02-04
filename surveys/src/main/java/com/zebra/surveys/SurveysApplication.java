package com.zebra.surveys;


import com.zebra.common.config.ModelMapperConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ModelMapperConfig.class)
public class SurveysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SurveysApplication.class, args);
    }

}
