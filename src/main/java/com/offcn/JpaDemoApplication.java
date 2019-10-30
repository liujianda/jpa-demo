package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class JpaDemoApplication {

    /*//设置时区 相差8小时
    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }*/

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

}
