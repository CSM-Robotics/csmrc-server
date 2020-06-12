package club.csmrobotics.csmrcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"club.csmrobotics.*"})
@EntityScan(basePackages = {"club.csmrobotics.*"})
@SpringBootApplication
public class CsmrcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsmrcServerApplication.class, args);
	}

}
