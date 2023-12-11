package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    default List<Car> getAllCars() {
        return null;
    }
    List<Car> getSpecifiedNumberOfCars(List<Car> carList, int number);
}
