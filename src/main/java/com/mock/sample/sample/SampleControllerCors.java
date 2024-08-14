package com.mock.sample.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@RestController
public class SampleControllerCors {

  @Bean
  public CorsFilter corsFilterForCors() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.addAllowedOrigin("https://naver.com");
    configuration.addAllowedMethod("*");
    configuration.addAllowedHeader("*");
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/cors/**", configuration);
    return new CorsFilter(source);
  }

  @GetMapping("/cors")
  public String get() {
    return "cors";
  }
}
