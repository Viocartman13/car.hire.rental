package ro.agilehub.javacourse.car.hire.rental.client.core.manager.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ro.agilehub.javacourse.car.hire.rental.client.core.impl.FleetApiClient;
import ro.agilehub.javacourse.car.hire.rental.client.core.mapper.CarMapper;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.CarDO;
import ro.agilehub.javacourse.car.hire.rental.domain.manager.CarManager;

@Component
@RequiredArgsConstructor
public class CarManagerImpl implements CarManager {

    private final CarMapper carMapper;
    private final FleetApiClient fleetApiClient;

    @Override
    public CarDO getCar(Integer carId) {
        return carMapper.toDomainObject(fleetApiClient.getFleetCar(carId).getBody());
    }
}
