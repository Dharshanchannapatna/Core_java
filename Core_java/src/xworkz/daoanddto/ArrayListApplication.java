package xworkz.daoanddto;

import xworkz.daoanddto.dto.BikeDto;
import xworkz.daoanddto.services.BikeServiceImpl;
import xworkz.daoanddto.services.BikeServices;
import xworkz.daoanddto.services.BikeServiceImpl;

public class ArrayListApplication {

	public static void main(String[] args) {
		
		BikeDto hornett = new BikeDto();
		hornett.setModelNo(15685);
		hornett.setCompanyName("Honda");
		hornett.setCubicCapacity("180cc");
		hornett.setColor("Matt-Orange");
		hornett.setPrice(180000.00);
		hornett.setTopSpeed(153);
		
		BikeDto apache = new BikeDto();
		apache.setModelNo(15675);
		apache.setCompanyName("TVS");
		apache.setCubicCapacity("160cc");
		apache.setColor("Blue");
		apache.setPrice(14700.00);
		apache.setTopSpeed(140);
		
		BikeDto extreme = new BikeDto();
		extreme.setModelNo(15677);
		extreme.setCompanyName("Hero");
		extreme.setCubicCapacity("160cc");
		extreme.setColor("White-Red");
		extreme.setPrice(144000);
		extreme.setTopSpeed(125);
		
		BikeDto fZ = new BikeDto();
		fZ.setModelNo(156525);
		fZ.setCompanyName("Yamaha");
		fZ.setCubicCapacity("149cc");
		fZ.setColor("Blue");
		fZ.setPrice(141000.00);
		fZ.setTopSpeed(125);
		
		BikeDto gixxer = new BikeDto();
		gixxer.setModelNo(156775);
		gixxer.setCompanyName("Suzuki");
		gixxer.setCubicCapacity("155cc");
		gixxer.setColor("Black");
		gixxer.setPrice(169000.00);
		gixxer.setTopSpeed(134);
		
		BikeServices service = new BikeServiceImpl();
		service.addBike(hornett);
		service.addBike(apache);
		service.addBike(extreme);
		service.addBike(fZ);
		service.addBike(gixxer);
		
		System.out.println("");
		
		service.getBike("Yamaha");
		
		System.out.println("");
		
		gixxer.setCompanyName("Suzuki-GixxerSF");
		service.updateBike(gixxer);
		
		System.out.println("");
		
		service.deleteBike(fZ);
	}
}
