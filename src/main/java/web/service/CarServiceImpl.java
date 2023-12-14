package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

//    @Override
//    public List<Car> getAllCars() {
//        List<Car> carList = new ArrayList<>();
//        {
//            carList.add(new Car("Toyota", 2020, "Red"));
//            carList.add(new Car("Mazda", 2015, "Silver"));
//            carList.add(new Car("Ford", 2018, "Black"));
//            carList.add(new Car("Chevrolet", 2017, "White"));
//            carList.add(new Car("LADA", 2016, "White"));
//        }
//        return carList;
//    }
    @Override
    public List<Car> getSpecifiedNumberOfCars(List<Car> carList, int number) {
        if (number <= 0) {
            return new ArrayList<Car>();
        }
        if (number >= carList.size()) {
            return carList;
        }
        return carList.subList(0, number);
    }
}