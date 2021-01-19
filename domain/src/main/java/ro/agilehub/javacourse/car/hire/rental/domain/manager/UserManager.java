package ro.agilehub.javacourse.car.hire.rental.domain.manager;

import ro.agilehub.javacourse.car.hire.rental.domain.domain.UserDO;

public interface UserManager {

    UserDO getUser(Integer userId);
}
