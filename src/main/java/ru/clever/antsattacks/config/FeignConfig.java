package ru.clever.antsattacks.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.dialect.SpringStandardDialect;

@Configuration
public class FeignConfig {
  @Bean
  Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
  }

//  @Bean
//  public SpringTemplateEngine templateEngine() {
//    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//    SpringStandardDialect dialect = new SpringStandardDialect();
//
//    // ⚠️ Это включает доступ к static и new
//    dialect.setEnableSpringELCompiler(true);
//
//    templateEngine.setDialect(dialect);
//    return templateEngine;
//  }
}
