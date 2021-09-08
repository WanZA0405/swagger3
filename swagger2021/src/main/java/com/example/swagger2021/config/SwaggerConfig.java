package com.example.swagger2021.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created on 2021/8/17 16:39;
 *
 * @author Wan a
 */

@EnableOpenApi //开启 swagger 3
@Configuration
public class SwaggerConfig {

    /**
     * 初始化接口文档
     * @return
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.swagger2021.controller"))//设置扫描路径
                .build();
    }

    /**
     * 生成接口信息 大致详情
     * @return ApiInfoBuilder
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger3接口文档")
                .description("更多请咨询开发者")
                .contact(new Contact("Wan_A","wana0405.top","1523090554@qq.com"))
                .version("1.0")
                .build();
    }
}
