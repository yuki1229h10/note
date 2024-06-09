package com.example.JavaConfigApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.JavaConfigApp.service.BusinessLogic;
import com.example.JavaConfigApp.service.impl.SampleLogicImpl;
import com.example.JavaConfigApp.service.impl.TestLogicImpl;

@Configuration
public class AppConfig {
	@Bean(name = "test")
	public BusinessLogic dataLogic() {
		return new TestLogicImpl();
	}

	@Bean(name = "sample")
	public BusinessLogic viewLogic() {
		return new SampleLogicImpl();
	}
}
