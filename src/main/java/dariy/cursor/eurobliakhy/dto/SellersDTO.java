package dariy.cursor.eurobliakhy.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Getter
@Setter
public class SellersDTO {
    @NotEmpty(message = "firstName can not be empty")
    private String firstName;

    @NotEmpty(message = "lastName can not be empty")
    private String lastName;

    @NotEmpty(message = "email can not be empty")
    @Email(message = "Invalid EMAIL")
    private String email;

    @NotEmpty(message = "password can not be empty")
    @Size(min = 4,max = 20, message = "password must be from 4 to 20")
    private String password;

    @NotEmpty(message = "phoneNumber can not be empty")
    @Size(min = 10,max = 13, message = "phoneNumber must be from 10 to 13")
    private String phoneNumber;
}
