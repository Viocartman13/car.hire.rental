package ro.agilehub.javacourse.car.hire.rental.domain.service.definition;

import ro.agilehub.javacourse.car.hire.rental.domain.domain.RentalDO;

public interface RentalService {

    Integer createNewRental(RentalDO example);

    RentalDO getRental(Integer rentalId);
}
