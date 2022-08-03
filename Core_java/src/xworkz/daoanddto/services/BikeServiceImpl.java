package xworkz.daoanddto.services;
import xworkz.daoanddto.dao.*;
import xworkz.daoanddto.services.*;
import xworkz.daoanddto.dto.*;

public class BikeServiceImpl implements BikeServices{

	BikeDao bikeDao = new BikeDaoImpl();
	
	@Override
	public void addBike(BikeDto dto) {
		bikeDao.addBike(dto);
	}

	@Override
	public BikeDto getBike(String dto) {
	return bikeDao.getBike(dto);
	}

	@Override
	public void updateBike(BikeDto dto) {
		bikeDao.updateBike(dto);
	}

	@Override
	public void deleteBike(BikeDto dto) {
		bikeDao.deleteBike(dto);
	}

}
