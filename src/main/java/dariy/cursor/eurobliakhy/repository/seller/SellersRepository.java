package dariy.cursor.eurobliakhy.repository.seller;

import dariy.cursor.eurobliakhy.model.Cars;
import dariy.cursor.eurobliakhy.model.Sellers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface SellersRepository extends JpaRepository<Sellers,Long> {
    Sellers findByFirstName(String name);
    Sellers findByPhoneNumberLike(String num);
}
