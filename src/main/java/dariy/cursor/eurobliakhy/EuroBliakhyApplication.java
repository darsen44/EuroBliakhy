package dariy.cursor.eurobliakhy;

import dariy.cursor.eurobliakhy.repository.car.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories
public class EuroBliakhyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuroBliakhyApplication.class, args);
	}
}
