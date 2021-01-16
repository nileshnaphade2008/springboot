package com.nileshpoc.cxf.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camel-context.xml")
public class CamelCxfStandaloneBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelCxfStandaloneBootApplication.class, args);
	}

}
