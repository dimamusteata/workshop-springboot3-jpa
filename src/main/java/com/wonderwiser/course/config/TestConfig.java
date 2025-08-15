package com.wonderwiser.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wonderwiser.course.entities.Order;
import com.wonderwiser.course.entities.User;
import com.wonderwiser.course.entities.enums.OrderStatus;
import com.wonderwiser.course.repositories.OrderRepository;
import com.wonderwiser.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com"	, "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com"	, "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-06-20T19:52:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2025-07-21T09:12:50Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2025-07-22T11:32:11Z"), OrderStatus.DELIVERED, u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		
	}
	
	
}
