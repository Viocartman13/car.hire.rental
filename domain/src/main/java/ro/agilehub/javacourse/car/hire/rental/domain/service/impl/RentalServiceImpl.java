package ro.agilehub.javacourse.car.hire.rental.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final UserApi userApi;

    @Override
    public Integer createNewRental(RentalDO example) {
        var userDTOResponseEntity = userApi.getUser(example.getUser().getId());
        return 123;
    }

}
