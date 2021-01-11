package ro.agilehub.javacourse.car.hire.rental.rental.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.rental.rental.repository.RentalRepository;
import ro.agilehub.javacourse.car.hire.rental.rental.service.definition.RentalService;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalDO;
import ro.agilehub.javacourse.car.hire.rental.rental.service.mapper.RentalDOMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;
    private final RentalDOMapper rentalDOMapper;

    @Override
    public Integer createNewRental(RentalDO example) {
        return rentalRepository.save(rentalDOMapper.toRental(example)).getId();
    }

    @Override
    public List<RentalDO> getRentals() {
        return rentalDOMapper.toRentalDOList(rentalRepository.findAll());
    }

}
