package com.sl;

import com.sl.config.FileProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/*@EnableConfigurationProperties({
        FileProperty.class
})*/
public class SpringbootUploadApplication  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootUploadApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadApplication.class, args);
    }

}
