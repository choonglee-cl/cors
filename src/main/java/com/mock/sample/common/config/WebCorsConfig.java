package com.mock.sample.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class WebCorsConfig {
  /**
   * Cors origin
   */
//  @Bean
//  public CorsFilter corsFilter() {
//    CorsConfiguration configuration = new CorsConfiguration();
//    configuration.addAllowedOrigin("*");
//    configuration.addAllowedMethod("*");
//    configuration.addAllowedHeader("*");
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    source.registerCorsConfiguration("/**", configuration);
//    return new CorsFilter(source);
//  }
}
