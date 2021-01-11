package ro.agilehub.javacourse.car.hire.rental.client.core.impl;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ro.agilehub.javacourse.car.hire.rental.client.core.model.CarDTO;
import ro.agilehub.javacourse.car.hire.rental.client.core.specification.FleetApi;

import java.util.NoSuchElementException;

@FeignClient(name = "${fleet.name:fleet}", url = "${fleet.url:http://localhost:8080}")
public interface FleetApiClient extends FleetApi {
    String CORE = "core";

    @Override
    @CircuitBreaker(name = CORE, fallbackMethod = "coreFallback")
    @RateLimiter(name = CORE)
    @GetMapping(value = "/fleet/{carId}")
    ResponseEntity<CarDTO> getFleetCar(@PathVariable("carId") Integer carId);

    default ResponseEntity<CarDTO> coreFallback(Integer carId, CallNotPermittedException exception) {
        throw new NoSuchElementException();
    }

    default ResponseEntity<CarDTO> coreFallback(Integer carId, Exception exception) {
        throw new RuntimeException();
    }
}
