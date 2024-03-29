## Spring Boot 集成 Swagger 接口文档

>1-导入依赖
 <!-- web spring boot 集成 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.5.6</version>
        </dependency>

        <!-- knife4j 依赖包 -->
        <dependency>
            <groupId>com.github.xiaoymin</groupId>
            <artifactId>knife4j-spring-boot-starter</artifactId>
            <version>2.0.9</version>
        </dependency>

        <!-- 单元测试 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <version>2.5.6</version>
            <scope>test</scope>
        </dependency>
>2 书写配置类

    @Configuration
    @EnableSwagger2WebMvc
    public class Knife4jConfiguration {
        // 注入Bean对象
        @Bean(value = "knife4jApi")
        public Docket knife4jApi() {
            // 声明当前接口文档使用类型
            Docket docket = new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(new ApiInfoBuilder()
                            // 接口文档标题
                            .title("Spring Boot 集成Knife4j测试")
                            // 简介
                            .description(" # 测试Knife4j集成")
                            // 服务url
                            .termsOfServiceUrl("http://10.168.0.246:8080")
                            // 作者
                            .contact("xuzihan20221229@163.com")
                            // 当前接口文档版本
                            .version("1.0")
                            .build())
                    // 首页展示名称
                    .groupName("Swageer 2.X 版本")
                    .select()
                    // 当前接口文档扫描的包路径
                    .apis(RequestHandlerSelectors.basePackage("com.cattywhale.spring.swagger.controller"))
                    // 是否扫描当前所有内容
                    .paths(PathSelectors.any())
                    .build();
            return docket;
        }
    }
>3 书写启动类并启动
> 
>4 访问ip:port/doc.html
