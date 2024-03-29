/**
 * project name:<font size = "1"><b>Knife4j自动配置类</b></font><br>
 * file name:<font size = "1"><b>Knife4jConfiguration</b></font><br>
 * description:<font size = "1"><b>Knife4j自动配置类</b></font><br>
 *
 * @version 1.0.0<br>
 * @update [1] [2024/3/29 9:57] [xuzihan] [新建] <br>
 */
package com.cattywhale.spring.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import javax.print.Doc;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    // 注入Bean对象
    @Bean(value = "knife4jApi")
    public Docket knife4jApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("Spring Boot 集成Knife4j测试")
                        .description(" # 测试Knife4j集成")
                        .termsOfServiceUrl("http://10.168.0.246:8080")
                        .contact("xuzihan20221229@163.com")
                        .version("1.0")
                        .build())
                .groupName("Swageer 2.X 版本")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cattywhale.spring.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

}
