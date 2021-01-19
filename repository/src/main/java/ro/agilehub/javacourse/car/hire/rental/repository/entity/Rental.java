package ro.agilehub.javacourse.car.hire.rental.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(of = "id")
public class Rental {

    @Id
    private Integer id;

    private Integer userId;

    private Integer carId;

    private OffsetDateTime startDate;

    private OffsetDateTime endDate;

    private String status;
}
