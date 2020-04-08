package amm.vsu.dm.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "amm.vsu.dm")
@EnableSwagger2
public class DMApp {

  /**
   * Application entry point.
   */
  public static void main(final String[] args) {
    SpringApplication.run(DMApp.class);
  }

  @Bean
  public Docket aimApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("amm.vsu.dm.rest.api"))
        .build();
  }
}
