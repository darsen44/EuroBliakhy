package dariy.cursor.eurobliakhy.repository.car;

import dariy.cursor.eurobliakhy.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarsRepository extends JpaRepository<Cars,Long> {

    List<Cars> findAllByOrderByYearAsc();

    List<Cars> findAllByOrderByPriceAsc();

    List<Cars> findAllByOrderByCountryOfRegistrationAsc();
}
