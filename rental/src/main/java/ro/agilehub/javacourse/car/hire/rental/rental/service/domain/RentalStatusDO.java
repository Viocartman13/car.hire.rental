package ro.agilehub.javacourse.car.hire.rental.rental.service.domain;

public enum RentalStatusDO {

    ACTIVE("ACTIVE"),

    CANCELLED("CANCELLED");

    private final String value;

    RentalStatusDO(String value) {
        this.value = value;
    }
}
