package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

	private final CarServiceImpl carServiceImpl;
	private final CarDaoImpl carDaoImpl;

	@Autowired
    public CarsController(CarServiceImpl carServiceImpl, CarDaoImpl carDaoImpl) {
		this.carServiceImpl = carServiceImpl;
		this.carDaoImpl = carDaoImpl;
    }
	@GetMapping(value = "/cars")
	public String printCars(ModelMap model) {
		List<Car> carList = carDaoImpl.getAllCars();
		model.addAttribute("cars", carServiceImpl.getSpecifiedNumberOfCars(carList, 2));
		return "cars";
	}
}