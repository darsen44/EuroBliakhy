package dariy.cursor.eurobliakhy.service.seller.impl;

import dariy.cursor.eurobliakhy.model.Sellers;
import dariy.cursor.eurobliakhy.repository.seller.SellersRepository;
import dariy.cursor.eurobliakhy.service.seller.SellersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellersServiceImpl implements SellersService {

    private final SellersRepository repository;

    @Autowired
    public SellersServiceImpl(SellersRepository repository) {
        this.repository = repository;
    }

    @Override
    public Sellers getById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public void saveSeller(Sellers seller) {
        repository.save(seller);
    }

    @Override
    public void deleteSellerById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAllSellers() {
        repository.deleteAll();
    }

    @Override
    public List<Sellers> findAllSellers() {
        return repository.findAll();
    }
}
