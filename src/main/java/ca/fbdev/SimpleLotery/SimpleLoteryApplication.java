package ca.fbdev.SimpleLotery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleLoteryApplication {
	@Value("${DB_HOST:NOT_FOUND}")
    private String dbHost;

  public static void main(String[] args) {
    SpringApplication.run(SimpleLoteryApplication.class, args);
  }

  @Bean
    CommandLineRunner debugEnv() {
        return args -> {
            System.out.println("DEBUG: DB_HOST is " + dbHost);
        };
	}

}
