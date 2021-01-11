package ro.agilehub.javacourse.car.hire.rental.rental.service.definition;

import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalDO;

import java.util.List;

public interface RentalService {

    Integer createNewRental(RentalDO example);

    List<RentalDO> getRentals();
}
