package com.psgi.siapweb;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class SiapwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiapwebApplication.class, args);
	}


	@Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
