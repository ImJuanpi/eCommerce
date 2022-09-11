package mx.com.axity.productservice.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value= {"mx.com.axity.productservice"})
@EnableJpaRepositories("mx.com.axity.productservice.persistence")
@EntityScan("mx.com.axity.productservice.model")
public class ProductserviceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProductserviceApplication.class, args);
	}

}
