package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle.*;

import VehicleEntity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
