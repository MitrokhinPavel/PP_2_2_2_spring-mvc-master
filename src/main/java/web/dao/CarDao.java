package web.dao;
import web.model.Car;

import java.util.List;

public interface CarDao {
    default List<Car> getAllCars() {
        return null;
    }
}
