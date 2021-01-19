package ro.agilehub.javacourse.car.hire.rental.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.agilehub.javacourse.car.hire.rental.repository.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {
}
