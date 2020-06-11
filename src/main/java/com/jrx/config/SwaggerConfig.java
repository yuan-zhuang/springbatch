package com.jrx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 //开启Swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("袁壮")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jrx.controller")) //配置要扫描的接口
                .build();
    }

    //配置Swagger信息
    private ApiInfo apiInfo(){
        //作则信息
        Contact contact = new Contact("袁壮","","2965629576@qq.com");
        return new ApiInfo(
                "Swagger API文档",
                "晚来天欲雪，能饮一杯无？",
                "v1.0",
                "https://swagger.io",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
