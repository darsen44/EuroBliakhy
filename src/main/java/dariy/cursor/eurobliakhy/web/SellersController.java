package dariy.cursor.eurobliakhy.web;

import dariy.cursor.eurobliakhy.dto.CarDTO;
import dariy.cursor.eurobliakhy.model.Cars;
import dariy.cursor.eurobliakhy.model.Sellers;
import dariy.cursor.eurobliakhy.repository.seller.SellersRepository;
import dariy.cursor.eurobliakhy.service.car.CarsService;
import dariy.cursor.eurobliakhy.service.seller.SellersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellersController {
    private final SellersService sellersService;
    private final CarsService carsService;

    @Autowired
    public SellersController(SellersService sellersService, CarsService carsService) {
        this.sellersService = sellersService;
        this.carsService = carsService;
    }


    @GetMapping("/all")
    public List<Sellers> getAllSellers() {
        return sellersService.findAllSellers();
    }

    @Transactional
    @PostMapping("/{sellerId}/cars")
    public List<Cars> addCarBySellerId(@PathVariable(value = "sellerId") Long sellerId,
                                       @RequestBody
                                      @NotNull
                                      @Valid List<CarDTO> carDTOs) {

        return carsService.saveCar(sellerId,carDTOs);
    }
}
