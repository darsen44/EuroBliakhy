package dariy.cursor.eurobliakhy.service.car;

import dariy.cursor.eurobliakhy.dto.CarDTO;
import dariy.cursor.eurobliakhy.model.Cars;

import java.util.List;

public interface CarsService {
    Cars getById(Long id);

    List<Cars> saveCar(Long sellerId, List<CarDTO> carDTOS);

    void deleteCarById(Long id);

    void deleteAllCars();

    List<Cars> findAllCars();

    List<Cars> findAllByOrderByYearAsc();

    List<Cars> findAllByOrderByPriceAsc();

    List<Cars> findAllByOrderByCountryOfRegistrationAsc();
}

