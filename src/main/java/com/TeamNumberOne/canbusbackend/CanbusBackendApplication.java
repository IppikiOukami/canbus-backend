package com.TeamNumberOne.canbusbackend;

import com.TeamNumberOne.canbusbackend.Controller.NodeManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.TeamNumberOne.canbusbackend.Controller"})
public class CanbusBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanbusBackendApplication.class, args);
	}
}
