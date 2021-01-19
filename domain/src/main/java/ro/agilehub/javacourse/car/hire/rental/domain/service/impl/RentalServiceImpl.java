package ro.agilehub.javacourse.car.hire.rental.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.RentalDO;
import ro.agilehub.javacourse.car.hire.rental.domain.manager.RentalManager;
import ro.agilehub.javacourse.car.hire.rental.domain.service.definition.RentalService;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final RentalManager rentalManager;

    @Override
    public Integer createNewRental(RentalDO example) {
        return rentalManager.createNewRental(example);
    }

    @Override
    public RentalDO getRental(Integer rentalId) {
        return rentalManager.getRental(rentalId);
    }

}
