package ro.agilehub.javacourse.car.hire.rental.client.core.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.rental.client.core.model.CarDTO;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.CarDO;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDTO toDTO(CarDO carDO);

    CarDO toDomainObject(CarDTO carDTO);
}
