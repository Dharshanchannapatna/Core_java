package xworkz.daoanddto.dao;

import xworkz.daoanddto.dto.BikeDto;

public interface BikeDao {
	void addBike(BikeDto dto);
	BikeDto getBike(String companyName);
	void updateBike(BikeDto dto);
	void deleteBike(BikeDto dto);

}
