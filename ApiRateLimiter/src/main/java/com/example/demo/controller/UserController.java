package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	@RateLimiter(name = "api1", fallbackMethod = "rateLimiterFallback")
	public ResponseEntity<List<User>> getUsers()
	{
		return ResponseEntity.ok(userService.get());
	}
	
	public ResponseEntity<String> rateLimiterFallback(Exception e){
		return new ResponseEntity<String>("Rate Limit Exceeded",HttpStatus.TOO_MANY_REQUESTS);
	}
	
	@GetMapping("/user/greet/{name}")
	@RateLimiter(name = "api2", fallbackMethod = "rateLimiterFallback")
	public ResponseEntity<String> welcomeUser(@PathVariable String name){
		
		String greet = "Welcome  "+name+" !";
		return ResponseEntity.ok(greet);
	}
}


