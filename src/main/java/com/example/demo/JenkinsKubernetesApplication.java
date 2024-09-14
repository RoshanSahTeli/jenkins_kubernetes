package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsKubernetesApplication.class, args);
		System.out.println("Hello i am running");
		System.out.println("Running after first commit");
		System.out.println("Running after second commit");
		System.out.println("Running after third commit");
	}

}
