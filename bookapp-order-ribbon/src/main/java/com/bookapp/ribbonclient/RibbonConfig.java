package com.bookapp.ribbonclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
@Configuration
public class RibbonConfig {
	
	@Bean
	public IRule rule() {
		return new WeightedResponseTimeRule();
	}
	

}
