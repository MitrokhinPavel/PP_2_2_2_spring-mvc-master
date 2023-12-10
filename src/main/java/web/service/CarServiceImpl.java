package web.service;

import web.model.Car;
import web.model.CarList;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> carList = CarList.createCarList();
        return carList;
    @Override
    public List<Car> getSpecifiedNumberOfCars(List<Car> carList,int number) {
        if (number <= 0 || number > carList.size()) {
            throw new IllegalArgumentException("Выход за границы списка машин");
        }
        return carList.subList(0, number);
    }
}