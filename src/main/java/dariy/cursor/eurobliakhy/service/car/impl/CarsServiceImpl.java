package dariy.cursor.eurobliakhy.service.car.impl;

import dariy.cursor.eurobliakhy.model.Cars;
import dariy.cursor.eurobliakhy.repository.car.CarsRepository;
import dariy.cursor.eurobliakhy.service.car.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarsServiceImpl implements CarsService {

    private final CarsRepository repository;

    @Autowired
    public CarsServiceImpl(CarsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cars getById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Cars getByModel(String name) {
        return repository.findByModel(name);
    }

    @Override
    public Cars getByYear(Integer integer) {
        return repository.findByYear(integer);
    }

    @Override
    public Cars getByPrice(String name) {
        return repository.findByPrice(name);
    }

    @Override
    public void saveCar(Cars car) {
        repository.save(car);
    }

    @Override
    public void deleteCarById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAllCars() {
        repository.deleteAll();
    }

    @Override
    public List<Cars> findAllCars() {
        return repository.findAll();
    }
}
