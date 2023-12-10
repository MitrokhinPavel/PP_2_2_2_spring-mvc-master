package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void printCarList(List<Car> carList);
    List<Car> getSpecifiedNumberOfCars(List<Car> carList, int number);
}
