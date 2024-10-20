package com.cloud.swiftbuy.resource_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {
	@Bean
	public RedisTemplate<?, ?> redisTemplate(){
		RedisTemplate<?, ?> template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnectionFactory());
		return template;
	}
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setHostName("localhost");
		jedisConnectionFactory.setPort(6379);
		return jedisConnectionFactory;
	}

}
