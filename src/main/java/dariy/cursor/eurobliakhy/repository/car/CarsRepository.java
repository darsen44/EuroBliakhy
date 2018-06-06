package dariy.cursor.eurobliakhy.repository.car;

import dariy.cursor.eurobliakhy.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarsRepository extends JpaRepository<Cars,Long> {
    List<Cars> allCarsOrderByYear();
    List<Cars> allCarsOrderByPrice();
    List<Cars> allCarsOrderByCountryOfRegistration();
    Cars getById(Long id);

    Cars findByModel(String name);

    Cars findByYear(Integer integer);

    Cars findByPrice(String name);
}
