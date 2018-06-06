package dariy.cursor.eurobliakhy.service.car;

import dariy.cursor.eurobliakhy.model.Cars;

import java.util.List;

public interface CarsService {
    Cars getById(Long id);

    Cars getByModel(String name);

    Cars getByYear(Integer integer);

    Cars getByPrice(String name);

    void saveCar(Cars car);

    void deleteCarById(Long id);

    void deleteAllCars();

    List<Cars> findAllCars();

}
