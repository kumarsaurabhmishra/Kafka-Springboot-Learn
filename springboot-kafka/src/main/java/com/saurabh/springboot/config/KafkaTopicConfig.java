package com.saurabh.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic getKafkaTopic() {
		return TopicBuilder.name("topic")
				.build();
	}
	

}
