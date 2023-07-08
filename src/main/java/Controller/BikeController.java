package Controller;

import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Exception.BrandNotFound;
import Exception.ColourNotFound;
import Service.BikeService;
import VehicleEntity.BikeEntity;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {
	@Autowired
	BikeService bikeSer;
	//preparation batch
	static Logger log=Logger.getLogger(BikeController.class);
			
//MS Class
	@PostMapping(value = "/Insert")
	public String addDetails(@RequestBody BikeEntity c) {
		return bikeSer.addDetails(c);
	}

	@PostMapping(value = "/List")
	public String addList(@RequestBody List<BikeEntity> c) {
		return bikeSer.addList(c);
	}

	@GetMapping(value = "/GetId/{c}")
	public BikeEntity id(@PathVariable int c) {
		return bikeSer.id(c);
	}

	@GetMapping(value = "/AllDetails")
	public List<BikeEntity> alldetails() {
		PropertyConfigurator.configure("bike.properties");
		log.info(bikeSer.alldetails());
		return bikeSer.alldetails();
	}

	@DeleteMapping(value = "/Delete/{c}")
	public String deleteid(@PathVariable int c) {
		return bikeSer.deleteid(c);
	}

	@PutMapping(value = "/Update")
	public String update(@RequestBody BikeEntity c) {
		return bikeSer.update(c);
	}

	@PutMapping(value = "/UpdatedbyId/{a}")
	public String updataData(@RequestBody BikeEntity c, @PathVariable int a) {
		return bikeSer.updateData(c, a);
	}

	@GetMapping(value = "/GetBrand/{c}")
	public List<BikeEntity> brand(@PathVariable String c)throws BrandNotFound,Exception {
		return bikeSer.brand(c);
	}
	@GetMapping(value="/GetColour/{c}")
	public List<BikeEntity> colour(@PathVariable String c)throws ColourNotFound,Exception{
		return bikeSer.colour(c);
	}
	}

