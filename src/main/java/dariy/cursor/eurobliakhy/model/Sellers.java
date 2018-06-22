package dariy.cursor.eurobliakhy.model;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Sellers")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sellers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "first_Name")
    private String firstName;

    @NotEmpty
    @Column(name = "last_Name")
    private String lastName;

    @Email(message = "Invalid EMAIL")
    @Column(unique = true)
    private String email;

    @NotEmpty
    private String password;

    @Column(name = "phone_Number")
    @Size(min = 10,max = 13)
    private String phoneNumber;

}
