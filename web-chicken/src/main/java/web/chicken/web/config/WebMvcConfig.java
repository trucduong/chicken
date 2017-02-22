package web.chicken.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import core.web.config.BaseWebMvcConfig;

@Configuration
@ComponentScan(basePackages = { "web.chicken.web" })
@EnableWebMvc
public class WebMvcConfig extends BaseWebMvcConfig {

}