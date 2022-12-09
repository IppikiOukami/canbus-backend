/**
 * @author Mario Everardo Macias
 */
package com.TeamNumberOne.canbusbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Runs the full Spring Boot application on port 8080
 */
@SpringBootApplication
@ComponentScan({"com.TeamNumberOne.canbusbackend.Controller"})
public class CanbusBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanbusBackendApplication.class, args);
	}
}
