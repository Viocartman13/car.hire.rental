package ro.agilehub.javacourse.car.hire.rental.domain.manager;

import ro.agilehub.javacourse.car.hire.rental.domain.domain.CarDO;

public interface CarManager {

    CarDO getCar(Integer carId);
}
