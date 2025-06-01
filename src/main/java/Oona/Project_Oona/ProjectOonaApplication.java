package Oona.Project_Oona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"LogicaNegocio"})
@EnableJpaRepositories(basePackages = {"Repository"})
@ComponentScan(basePackages = {"controller"})
public class ProjectOonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectOonaApplication.class, args);


	}
}
