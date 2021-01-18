package ro.agilehub.javacourse.car.hire.rental.domain.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class CarDO {

    private Integer id;

}
