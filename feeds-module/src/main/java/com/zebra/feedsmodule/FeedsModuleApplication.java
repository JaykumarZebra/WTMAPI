package com.zebra.feedsmodule;

import com.zebra.common.config.ModelMapperConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(ModelMapperConfig.class)
@SpringBootApplication
public class FeedsModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedsModuleApplication.class, args);
    }

}
