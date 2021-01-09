package ro.agilehub.javacourse.car.hire.rental.rental.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private Integer carId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String status;
}
