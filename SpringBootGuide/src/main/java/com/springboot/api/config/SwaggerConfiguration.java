/*rest api 명세를 문서화른 간편화 시키기 위해서 필요
rest api는 개발 과정 중 항상 수정이 되기 마련이다
따라서 그 흔적을 남겨줘야 다른 개발자들에게도 편할 것이다.*/
package com.springboot.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiIngo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.api"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiIngo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Open API Test with Swagger")
                .description("설명 부분")
                .version("1.0.0")
                .build();
    }
}