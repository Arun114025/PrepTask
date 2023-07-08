package Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Exception.BrandNotFound;
import Exception.ColourNotFound;
import Repository.BikeRepository;
import VehicleEntity.BikeEntity;



@Repository
public class BikeDao {
	@Autowired
	BikeRepository repo;

	public String addDetails(BikeEntity c) {
		repo.save(c);
		return "Success";
	}

	public String addList(List<BikeEntity> c) {
		repo.saveAll(c);
		return "List Successfully Save";
	}

	public BikeEntity id(int c) {
		return repo.findById(c).get();
	}

	public List<BikeEntity> alldetails() {
		return repo.findAll();
	}

	public String deleteid(int c) {
		repo.deleteById(c);
		return "Deleted SuccessFully";

	}

	public String update(BikeEntity c) {
		repo.save(c);
		return "Updated Successfully";
	}

	public String updateData(BikeEntity c, int a) {
		repo.save(c);
		return "Updated";
	}
    public List<BikeEntity> brand(String c) throws BrandNotFound, Exception{
    	return repo.getByBrand(c);
    }
    public List<BikeEntity> colour(String c) throws ColourNotFound,Exception{
    	return repo.getByColour(c);
    }
}
