package abc.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Welcome to Java");
		System.out.println("this project is of spring boot");
	}

}

