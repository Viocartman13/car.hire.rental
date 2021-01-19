package ro.agilehub.javacourse.car.hire.rental.client.core.manager.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ro.agilehub.javacourse.car.hire.rental.client.core.impl.UserApiClient;
import ro.agilehub.javacourse.car.hire.rental.client.core.mapper.UserMapper;
import ro.agilehub.javacourse.car.hire.rental.domain.domain.UserDO;
import ro.agilehub.javacourse.car.hire.rental.domain.manager.UserManager;

@Component
@RequiredArgsConstructor
public class UserManagerImpl implements UserManager {

    private final UserApiClient userApiClient;
    private final UserMapper userMapper;

    @Override
    public UserDO getUser(Integer userId) {
        return userMapper.toDomainObject(userApiClient.getUser(userId).getBody());
    }
}
