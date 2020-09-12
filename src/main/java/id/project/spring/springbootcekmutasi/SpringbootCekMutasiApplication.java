package id.project.spring.springbootcekmutasi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(
		scanBasePackages = {
				"id.project.spring"
		}
)

@ComponentScan(
		basePackages = {
				"id.project.spring.springbootcekmutasi.controller",
				"id.project.spring.springbootcekmutasi.model",
				"id.project.spring.springbootcekmutasi.repository"
		}
)

@EnableJpaRepositories(
		basePackages = {
				"id.project.spring.springbootcekmutasi.repository"
		}
)
@EntityScan(
		basePackages = {
				"id.project.spring.springbootcekmutasi.model"
		}
)

@EnableSwagger2
public class SpringbootCekMutasiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCekMutasiApplication.class, args);
	}

}
