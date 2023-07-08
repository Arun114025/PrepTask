package Service;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.CarDao;
import VehicleEntity.CarEntity;

@Service
public class CarService {
	@Autowired
	CarDao cardao;

	public String addDetails(CarEntity c) {
		return cardao.addDetails(c);
	}

	public String addList(List<CarEntity> c) {
		return cardao.addList(c);
	}

	public CarEntity id(int c) {
		return cardao.id(c);
	}

	public List<CarEntity> alldetails() {
		return cardao.alldetails();
	}

	public String deleteid(int c) {
		return cardao.deleteid(c);
	}

}
