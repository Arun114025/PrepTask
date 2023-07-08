package Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Repository.CarRepository;
import VehicleEntity.CarEntity;



@Repository
public class CarDao {
	@Autowired
	CarRepository repo;

	public String addDetails(CarEntity c) {
		repo.save(c);
		return "Success";
	}

	public String addList(List<CarEntity> c) {
		repo.saveAll(c);
		return "List Successfully Save";
	}

	public CarEntity id(int c) {
		return repo.findById(c).get();
	}

	public List<CarEntity> alldetails() {
		return repo.findAll();
	}

	public String deleteid(int c) {
		repo.deleteById(c);
		return "Deleted SuccessFully";

	}

}
