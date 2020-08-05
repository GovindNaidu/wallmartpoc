package in.bushansirgur.springboot.crudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CrudapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudapiApplication.class, args);
	}

}

