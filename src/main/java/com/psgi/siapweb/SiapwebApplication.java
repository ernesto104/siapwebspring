package com.psgi.siapweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class SiapwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiapwebApplication.class, args);
	}

}
