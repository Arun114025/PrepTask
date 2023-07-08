package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import VehicleEntity.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity, Integer> {
	
	@Query(value="Select * from bike where name like ?",nativeQuery=true)
	public List<BikeEntity> getByBrand(String c);
	
	@Query(value="Select * from bike where colour like ?",nativeQuery=true)
	public List<BikeEntity> getByColour(String c);


}
