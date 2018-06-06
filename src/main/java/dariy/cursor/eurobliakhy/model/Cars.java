package dariy.cursor.eurobliakhy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "Cars")
@Getter
@Setter
@ToString
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private Integer price;

    @NotEmpty
    private Integer year;

    @NotEmpty
    private String type;

    @NotEmpty
    private String model;

    @NotEmpty
    private String mark;

    @Column(name = "country_of_Registration")
    @NotEmpty
    private String countryOfRegistration;

    @NotEmpty
    private String description;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinTable(name = "seller_of_Car",joinColumns = @JoinColumn(name = "Sellers_id"),
//    inverseJoinColumns = @JoinColumn(name = ""))
//    private Sellers seller;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Sellers seller;

//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_Time", nullable = false, updatable = false)
//    @CreatedDate
//    private Date createdTime = new Date();

}
