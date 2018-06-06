package dariy.cursor.eurobliakhy.web;

import dariy.cursor.eurobliakhy.repository.seller.SellersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellersController {
    private final SellersRepository repository;

    @Autowired
    public SellersController(SellersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String saveSeller(){
        return repository.toString();
    }
}
