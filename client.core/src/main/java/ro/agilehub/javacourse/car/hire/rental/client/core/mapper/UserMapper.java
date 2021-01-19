package ro.agilehub.javacourse.car.hire.rental.client.core.mapper;

import org.mapstruct.Mapper;
import ro.agilehub.javacourse.car.hire.rental.client.core.model.UserDTO;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.UserDO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(UserDO userDO);

    UserDO toDomainObject(UserDTO userDTO);

}
