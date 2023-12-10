package web.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car();
        car1.setModel("Toyota");
        car1.setYear(2020);
        car1.setColor("Red");
        carList.add(car1);

        Car car2 = new Car();
        car2.setModel("Honda");
        car2.setYear(2019);
        car2.setColor("Blue");
        carList.add(car2);

        Car car3 = new Car();
        car3.setModel("Ford");
        car3.setYear(2018);
        car3.setColor("Black");
        carList.add(car3);

        Car car4 = new Car();
        car4.setModel("Chevrolet");
        car4.setYear(2017);
        car4.setColor("White");
        carList.add(car4);

        Car car5 = new Car();
        car5.setModel("BMW");
        car5.setYear(2016);
        car5.setColor("Silver");
        carList.add(car5);

        return carList;
    }
}
