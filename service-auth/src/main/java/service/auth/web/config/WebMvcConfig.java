package service.auth.web.config;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import core.service.config.BaseServiceMvcConfig;
import service.auth.shared.service.AuthServiceActionConst;

@Configuration
@ComponentScan(basePackages = { "service.auth.web" })
@EnableWebMvc
public class WebMvcConfig extends BaseServiceMvcConfig {

	@Override
	protected void addByPassAuthorization(List<String> bypasses) {
		bypasses.add(AuthServiceActionConst.AUTH_SERVICE + AuthServiceActionConst.LOGIN);
		bypasses.add(AuthServiceActionConst.AUTH_SERVICE + AuthServiceActionConst.LOGOUT);
	}
}