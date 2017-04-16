package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.SampleService;
import service.SampleServiceImpl;

@Configuration
public class AppConfig {
	@Bean
	public SampleService getSampleService() {
		return new SampleServiceImpl();
	}
}

