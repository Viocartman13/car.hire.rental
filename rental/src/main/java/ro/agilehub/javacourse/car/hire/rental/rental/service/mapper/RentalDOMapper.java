package ro.agilehub.javacourse.car.hire.rental.rental.service.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.rental.rental.entity.Rental;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalDO;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RentalDOMapper {

    RentalDO toRentalDO(Rental rental);

    Rental toRental(RentalDO rentalDO);

    List<RentalDO> toRentalDOList(List<Rental> rentals);
}
