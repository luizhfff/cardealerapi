package com.lhfff.cardealerapi.controller;

import com.lhfff.cardealerapi.model.Car;
import com.lhfff.cardealerapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
	
	private final CarRepository carRepository;
	
	@Autowired
	public CarController(@Qualifier("CarRepository") CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	@GetMapping("/getCars")
	public List<Car> getAll() {
		return carRepository.findAll();
	}
	
	@GetMapping("/getCar/{id}")
	public Optional<Car> get(@PathVariable String id) {
		return carRepository.findById(id);
	}
	
	@PostMapping("/addCar")
	public String save(@RequestBody Car car) {
		carRepository.insert(car);
		return "Added car with ID : " + car.getId();
	}
	
	@DeleteMapping("/deleteCar/{car}")
	public String delete(@PathVariable Car car) {
		carRepository.delete(car);
		return "Deleted car with ID : " + car.getId();
	}
	
	@DeleteMapping("/deleteCar/{id}")
	public String deleteById(@PathVariable String id) {
		carRepository.deleteById(id);
		return "Deleted car with ID : " + id;
	}
}
