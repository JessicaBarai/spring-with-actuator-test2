package com.javatechie.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import io.opentracing.Tracer;


@SpringBootApplication
@RestController
public class SpringOpenshiftWithoutDatabaseApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "welcome to java!";
		
	}
	
	@GetMapping("test/{input}")
	public String congrats(@PathVariable String input) {
		return "hi" + input + "success!";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftWithoutDatabaseApplication.class, args);
	}

}
