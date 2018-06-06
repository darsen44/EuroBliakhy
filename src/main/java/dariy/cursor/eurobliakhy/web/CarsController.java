package dariy.cursor.eurobliakhy.web;

import dariy.cursor.eurobliakhy.repository.car.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {
    private final CarsRepository repository;

    @Autowired
    public CarsController(CarsRepository repository) {
        this.repository = repository;
    }


}
