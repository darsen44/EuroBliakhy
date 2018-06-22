package dariy.cursor.eurobliakhy.service.car.impl;

import dariy.cursor.eurobliakhy.dto.CarDTO;
import dariy.cursor.eurobliakhy.model.Cars;
import dariy.cursor.eurobliakhy.model.Sellers;
import dariy.cursor.eurobliakhy.repository.car.CarsRepository;
import dariy.cursor.eurobliakhy.repository.seller.SellersRepository;
import dariy.cursor.eurobliakhy.service.car.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarsServiceImpl implements CarsService {

    private final CarsRepository carsRepository;
    private final SellersRepository sellersRepository;

    @Autowired
    public CarsServiceImpl(CarsRepository carsRepository,SellersRepository sellersRepository) {
        this.carsRepository = carsRepository;
        this.sellersRepository = sellersRepository;
    }

    @Override
    public Cars getById(Long id) {
        return carsRepository.getOne(id);
    }

    @Override
    public List<Cars> saveCar(Long sellerId, List<CarDTO> carDTOS) {
        System.out.println("Service save car");
        List<Cars> newCars = new ArrayList<>();
        Sellers seller = sellersRepository.findById(sellerId)
                .orElseThrow(RuntimeException::new);

        carDTOS.forEach(carDTO ->newCars.add(
                carsRepository.save(Cars.builder()
                .price(carDTO.getPrice())
                .year(carDTO.getYear())
                .mark(carDTO.getMark())
                .model(carDTO.getModel())
                .type(carDTO.getType())
                .description(carDTO.getDescription())
                .countryOfRegistration(carDTO.getCountryOfRegistration())
                .seller(seller)
                .build())
        ) );
        return newCars;
    }

    @Override
    public void deleteCarById(Long id) {
        carsRepository.deleteById(id);
    }

    @Override
    public void deleteAllCars() {
        carsRepository.deleteAll();
    }

    @Override
    public List<Cars> findAllCars() {
        System.out.println("Service find all Cars");
        return carsRepository.findAll();
    }

    @Override
    public List<Cars> findAllByOrderByYearAsc() {
        System.out.println("Service sort cars by Year");
        return carsRepository.findAllByOrderByYearAsc();
    }

    @Override
    public List<Cars> findAllByOrderByPriceAsc() {
        System.out.println("Service sort cars by Price");
        return carsRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Cars> findAllByOrderByCountryOfRegistrationAsc() {
        System.out.println("Service sort cars by CountryOfRegistration");
        return carsRepository.findAllByOrderByCountryOfRegistrationAsc();
    }
}
