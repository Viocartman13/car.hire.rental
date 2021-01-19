package ro.agilehub.javacourse.car.hire.rental.domain.manager;

import ro.agilehub.javacourse.car.hire.rental.domain.domain.RentalDO;

public interface RentalManager {

    Integer createNewRental(RentalDO example);

    RentalDO getRental(Integer rentalId);
}
