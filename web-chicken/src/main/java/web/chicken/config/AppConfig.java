package web.chicken.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import core.web.config.BaseWebAppConfig;

@Configuration
@ComponentScan(basePackages = {"web.chicken" },
	excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = {"web.chicken.web.*" }))
@PropertySource(value = { "classpath:application.properties" })
@EnableScheduling
@EnableAspectJAutoProxy
@EnableCaching
public class AppConfig extends BaseWebAppConfig {

}