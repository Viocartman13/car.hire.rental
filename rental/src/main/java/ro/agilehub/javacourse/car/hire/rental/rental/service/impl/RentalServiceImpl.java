package ro.agilehub.javacourse.car.hire.rental.rental.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ro.agilehub.javacourse.car.hire.rental.client.core.impl.FleetApiClient;
import ro.agilehub.javacourse.car.hire.rental.client.core.impl.UserApiClient;
import ro.agilehub.javacourse.car.hire.rental.client.core.model.CarDTO;
import ro.agilehub.javacourse.car.hire.rental.client.core.model.UserDTO;
import ro.agilehub.javacourse.car.hire.rental.rental.repository.RentalRepository;
import ro.agilehub.javacourse.car.hire.rental.rental.service.definition.RentalService;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalDO;
import ro.agilehub.javacourse.car.hire.rental.rental.service.domain.RentalStatusDO;
import ro.agilehub.javacourse.car.hire.rental.rental.service.mapper.RentalDOMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;
    private final RentalDOMapper rentalDOMapper;
    private final UserApiClient userApiClient;
    private final FleetApiClient fleetApiClient;

    @Override
    public Integer createNewRental(RentalDO example) {
        ResponseEntity<UserDTO> userResponse = userApiClient.getUser(example.getUserId());
        log.info("User  " + userResponse.getBody().toString());
        ResponseEntity<CarDTO> carResponse = fleetApiClient.getFleetCar(example.getCarId());
        log.info("Car name " + carResponse.getBody().toString());
        example.setStatus(RentalStatusDO.ACTIVE);
        return rentalRepository.save(rentalDOMapper.toRental(example)).getId();
    }

    @Override
    public List<RentalDO> getRentals() {
        return rentalDOMapper.toRentalDOList(rentalRepository.findAll());
    }

}
