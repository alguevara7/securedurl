package net.securedurl

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {

  @Bean
  def title: String = "There will be secured URLs1"

}