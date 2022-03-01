package com.example.demo.base.contoller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController implements HealthIndicator {

	public boolean checkHealth() {
		return true;
		
	}
	
	@Override
	public Health health() {
		if(checkHealth()) {
			return Health.up().withDetail("db_status", "database is running").build();
		}
		return Health.down().withDetail("db_status", "database is crashed").build();
	}

}
