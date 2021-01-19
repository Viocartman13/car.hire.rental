package ro.agilehub.javacourse.car.hire.rental.repository.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.RentalDO;
import ro.agilehub.javacourse.car.hire.rental.repository.entity.Rental;

@Mapper(componentModel = "spring")
public interface RentalDOMapper {

    Rental toEntity(RentalDO rentalDO);

    RentalDO toDomainObject(Rental rental);
}
