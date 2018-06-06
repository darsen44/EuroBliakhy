package dariy.cursor.eurobliakhy.service.seller;

import dariy.cursor.eurobliakhy.model.Sellers;

import java.util.List;

public interface SellersService {
    Sellers getById(Long id);

    void saveSeller(Sellers seller);

    void deleteSellerById(Long id);

    void deleteAllSellers();

    List<Sellers> findAllSellers();
}