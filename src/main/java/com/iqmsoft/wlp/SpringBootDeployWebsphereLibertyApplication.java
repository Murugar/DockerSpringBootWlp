package com.iqmsoft.wlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDeployWebsphereLibertyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeployWebsphereLibertyApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootDeployWebsphereLibertyApplication.class);
	}
}
