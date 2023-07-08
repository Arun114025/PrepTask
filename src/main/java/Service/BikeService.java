package Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.vehicle.*;

import Dao.BikeDao;
import Exception.BrandNotFound;
import Exception.ColourNotFound;
import VehicleEntity.BikeEntity;

@Service
public class BikeService {
	@Autowired
	BikeDao bikedao;

	public String addDetails(BikeEntity c) {
		return bikedao.addDetails(c);
	}

	public String addList(List<BikeEntity> c) {
		return bikedao.addList(c);
	}

	public BikeEntity id(int c) {
		return bikedao.id(c);
	}

	public List<BikeEntity> alldetails() {
		return bikedao.alldetails();
	}

	public String deleteid(int c) {
		return bikedao.deleteid(c);
	}

	public String update(BikeEntity c) {
		return bikedao.update(c);
	}

	public String updateData(BikeEntity c, int a) {
		return bikedao.update(c);
	}
    public List<BikeEntity> brand(String c) throws BrandNotFound,Exception{
    	if(bikedao.brand(c).isEmpty()) {
    	throw new BrandNotFound("Brand not found");
    	}
    	else {
    		return bikedao.brand(c);
    	}
    	}
    public List<BikeEntity> colour(String c) throws ColourNotFound,Exception{
    	if(bikedao.colour(c).isEmpty()) {
    		throw new ColourNotFound("Colour Not Found");
    	}
    	else {
    		return bikedao.colour(c);
    	}
    	}
    }
    
