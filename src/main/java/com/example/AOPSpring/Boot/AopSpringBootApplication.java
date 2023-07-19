package com.example.AOPSpring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSpringBootApplication.class, args);
	}

}
