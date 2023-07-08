package Controller;

import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.CarService;
import VehicleEntity.CarEntity;


@RestController
@RequestMapping(value = "/Car")
public class CarController {
	@Autowired
	CarService carSer;
	
	static Logger log=Logger.getLogger(CarController.class);

	@PostMapping(value = "/Insert")
	public String addDetails(@RequestBody CarEntity c) {
		return carSer.addDetails(c);
	}

	@PostMapping(value = "/List")
	public String addList(@RequestBody List<CarEntity> c) {
		return carSer.addList(c);
	}

	@GetMapping(value = "/GetId/{c}")
	public CarEntity id(@PathVariable int c) {
		return carSer.id(c);
	}

	@GetMapping(value = "/AllDetails")
	public List<CarEntity> alldetails() {
		PropertyConfigurator.configure("car.properties");
		log.info(carSer.alldetails());
		return carSer.alldetails();
	}

	@DeleteMapping(value = "/Delete/{c}")
	public String deleteid(@PathVariable int c) {
		return carSer.deleteid(c);
	}

}
