package ro.agilehub.javacourse.car.hire.rental.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.agilehub.javacourse.car.hire.rental.rental.entity.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
}
