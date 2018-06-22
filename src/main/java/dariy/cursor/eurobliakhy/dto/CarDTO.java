package dariy.cursor.eurobliakhy.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
@Getter
@Setter
public class CarDTO {
    @NotEmpty(message = "price can not be empty")
    private Integer price;

    @NotEmpty(message = "year can not be empty")
    private Integer year;

    @NotEmpty(message = "type can not be empty")
    private String type;

    @NotEmpty(message = "model can not be empty")
    private String model;

    @NotEmpty(message = "mark can not be empty")
    private String mark;

    @NotEmpty(message = "country of registration can not be empty")
    private String countryOfRegistration;

    @NotEmpty(message = "description can not be empty")
    private String description;
}
