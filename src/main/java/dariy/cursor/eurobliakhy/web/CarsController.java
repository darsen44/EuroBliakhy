package dariy.cursor.eurobliakhy.web;

import dariy.cursor.eurobliakhy.model.Cars;
import dariy.cursor.eurobliakhy.repository.car.CarsRepository;
import dariy.cursor.eurobliakhy.service.car.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {
    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/all")
    public List<Cars> allCars(){
        return carsService.findAllCars();
    }

    @GetMapping("/sortedByYear")
    public List<Cars> sortedByYear(){
        return carsService.findAllByOrderByYearAsc();
    }

    @GetMapping("/sortedByPrice")
    public List<Cars> sortedByPrice(){
        System.out.println("Service sort cars by Price");
        return carsService.findAllByOrderByPriceAsc();
    }

    @GetMapping("/sortedByCountryOfRegistration")
    public List<Cars> sortedByCountryOfRegistration(){
        System.out.println("Service sort cars by CountryOfRegistration");
        return carsService.findAllByOrderByCountryOfRegistrationAsc();
    }
}
