package xworkz.daoanddto.services;
import xworkz.daoanddto.dto.*;
public interface BikeServices {
	void addBike(BikeDto dto);
	BikeDto getBike(String companyName);
	void updateBike(BikeDto dto);
	void deleteBike(BikeDto dto);

	
}
