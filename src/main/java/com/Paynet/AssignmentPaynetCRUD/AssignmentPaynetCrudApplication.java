package com.Paynet.AssignmentPaynetCRUD;

import com.Paynet.AssignmentPaynetCRUD.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AssignmentPaynetCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentPaynetCrudApplication.class, args);
	}

}
