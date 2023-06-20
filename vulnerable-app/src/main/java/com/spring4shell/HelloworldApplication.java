package com.spring4shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
class Spring4ShellPOC extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(Spring4ShellPOC.class, args);
	}
}
