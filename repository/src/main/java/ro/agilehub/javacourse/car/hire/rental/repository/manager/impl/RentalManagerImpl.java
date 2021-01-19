package ro.agilehub.javacourse.car.hire.rental.repository.manager.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.RentalDO;
import ro.agilehub.javacourse.car.hire.rental.domain.manager.RentalManager;
import ro.agilehub.javacourse.car.hire.rental.repository.mapper.RentalDOMapper;
import ro.agilehub.javacourse.car.hire.rental.repository.repository.RentalRepository;

@Component
@RequiredArgsConstructor
public class RentalManagerImpl implements RentalManager {

    private final RentalRepository rentalRepository;
    private final RentalDOMapper rentalDOMapper;

    @Override
    public Integer createNewRental(RentalDO example) {
        return rentalRepository.save(rentalDOMapper.toEntity(example)).getId();
    }

    @Override
    public RentalDO getRental(Integer rentalId) {
        return rentalDOMapper.toDomainObject(rentalRepository.getOne(rentalId));
    }
}
