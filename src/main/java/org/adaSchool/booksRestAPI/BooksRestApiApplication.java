package org.adaSchool.booksRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class BooksRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksRestApiApplication.class, args);
	}

}
