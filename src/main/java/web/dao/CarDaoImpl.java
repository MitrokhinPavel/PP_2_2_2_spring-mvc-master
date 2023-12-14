package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        {
            carList.add(new Car("Toyota", 2020, "Red"));
            carList.add(new Car("Mazda", 2015, "Silver"));
            carList.add(new Car("Ford", 2018, "Black"));
            carList.add(new Car("Chevrolet", 2017, "White"));
            carList.add(new Car("LADA", 2016, "White"));
        }
        return carList;
    }
}