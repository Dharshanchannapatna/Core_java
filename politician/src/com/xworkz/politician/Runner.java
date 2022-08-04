package com.xworkz.politician;

import com.xworkz.politician.constants.PartyName;
import com.xworkz.politician.constants.PartySymbol;
import com.xworkz.politician.dao.PoliticianDao;
import com.xworkz.politician.dao.PoliticianDaoImpl;
import com.xworkz.politician.dto.PoliticianDto;

public class Runner {

	public static void main(String[] args) {
		PoliticianDto politicianDto = new PoliticianDto(1, "Kalyan", PartyName.AAP, "Bangalore", 47, 50000.00,
				"Ragevendra", "Delhi", PartySymbol.BIKE);
		PoliticianDao politicianDao = new PoliticianDaoImpl();
		politicianDao.save(politicianDto);

		PoliticianDto politicianDto1 = new PoliticianDto(2, "Manoj", PartyName.CONGRESS, "Mysore", 42, 900000.00,
				"Nandesh", "Andrapradesh", PartySymbol.ELEPHANT);

		politicianDao.save(politicianDto1);

		PoliticianDto politicianDto2 = new PoliticianDto(3, "Arjun", PartyName.BJP, "Channapatna", 43, 600000.00,
				"Nandan", "Punjab", PartySymbol.CYCLE);

		politicianDao.save(politicianDto2);

		PoliticianDto politicianDto3 = new PoliticianDto(4, "Ram", PartyName.JDS, "Ramanagar", 52, 700000.00, "Abhi",
				"Ranchi", PartySymbol.FAN);

		politicianDao.save(politicianDto3);

		PoliticianDto politicianDto4 = new PoliticianDto(5, "Chandru", PartyName.KJP, "Bagalkot", 60, 900000.00,
				"Sachin", "Ranchi", PartySymbol.FORMER);

		politicianDao.save(politicianDto4);

		PoliticianDto politicianDto5 = new PoliticianDto(6, "Gagan", PartyName.KRS, "Hubli", 55, 7100000.00, "tarun",
				"UP", PartySymbol.GROOM);

		politicianDao.save(politicianDto5);

		PoliticianDto politicianDto6 = new PoliticianDto(7, "Chida", PartyName.PRAJAKEEYA, "Magadi", 55, 1700000.00,
				"Sharath", "Delhi", PartySymbol.LOTUS);

		politicianDao.save(politicianDto6);

		PoliticianDto politicianDto7 = new PoliticianDto(8, "Rakshith", PartyName.RSS, "Kanakapur", 65, 1800000.00,
				"Surya", "Jammu", PartySymbol.TV);

		politicianDao.save(politicianDto7);

		PoliticianDto politicianDto8 = new PoliticianDto(9, "Vikas", PartyName.SP, "Tumkur", 77, 8900000.00, "Raki",
				"UttarKand", PartySymbol.PEN);

		politicianDao.save(politicianDto8);

		PoliticianDto politicianDto9 = new PoliticianDto(10, "Shankar", PartyName.TDP, "Hassan", 86, 1400000.00,
				"Manohar", "Chennai", PartySymbol.PALM);

		politicianDao.save(politicianDto9);

		System.out.println("=====================");
		PoliticianDto y = politicianDao.findById(1);
		System.out.println(y);
		System.out.println("=====================");
		PoliticianDto u = politicianDao.findByIdAndPresident(5, "Sachin");
		System.out.println(u);
		System.out.println("=====================");
		PoliticianDto t = politicianDao.findByIdAndNameAndPresident(2, "Manoj", "Nandesh");
		System.out.println(t);
		System.out.println("==============");
		PoliticianDto o = politicianDao.findByIdAndName(4, "Ram");
		System.out.println(o);
		System.out.println("==============");
		String p=politicianDao.findNameById(10);
		System.out.println(p);
	}

}
