package barrunner;

import com.xworkz.bar.constants.Bartype;
import com.xworkz.bar.dao.BarDao;
import com.xworkz.bar.dao.BarDaoImpl;
import com.xworkz.bar.dto.BarDto;

public class Runner {

	public static void main(String[] args) {
	BarDto dto=new BarDto(1,"shilpa","jp nagar",Bartype.BARANDRESTURENT,1000.00,45000.00);
	BarDao dao=new BarDaoImpl();
	dao.save(dto);
	
	BarDto dto1=new BarDto(2,"Bangalore Bar","jay nagar",Bartype.WINESTORE,100000.00,45000.00*30);
	BarDao dao1=new BarDaoImpl();
	dao.save(dto1);
	
	BarDto dto2=new BarDto(3,"Sri Lakshmi","Indra nagar",Bartype.WINESTORE,150000.00,150000.00*30);
	BarDao dao2=new BarDaoImpl();
	dao.save(dto2);
	
	BarDto dto3=new BarDto(4,"Venketeshwara"," Majestic",Bartype.MSIL,50000.00,50000.00*30);
	BarDao dao3=new BarDaoImpl();
	dao.save(dto3);
	
	BarDto dto4=new BarDto(5,"Infinity","Ramanagara",Bartype.DEFAULT,60000.00,60000.00*30);
	BarDao dao4=new BarDaoImpl();
	dao.save(dto4);
	
	BarDto dto5=new BarDto(6,"Filter","Bidadi",Bartype.WINESTORE,70000.00,70000.00*30);
	BarDao dao5=new BarDaoImpl();
	dao.save(dto5);
	
	BarDto dto6=new BarDto(7,"Arjun","Channapatana",Bartype.WINESTORE,550000.00,550000.00*30);
	BarDao dao6=new BarDaoImpl();
	dao.save(dto6);
	
	BarDto dto7=new BarDto(8," Ganesh Bar","Kanakapura",Bartype.MSIL,45000.00,45000.00*30);
	BarDao dao7=new BarDaoImpl();
	dao.save(dto7);
	
	BarDto dto8=new BarDto(9,"Sky Blue","Kanakapura",Bartype.RESORT,800000.00,80000.00*30);
	BarDao dao8=new BarDaoImpl();
	dao.save(dto8);
	
	BarDto dto9=new BarDto(10,"Green ","Magdi",Bartype.WINESTORE,600000.00,60000.00*30);
	BarDao dao9=new BarDaoImpl();
	dao.save(dto9);
	
	BarDto dto10=new BarDto(11,"Central Bar","jay nagar",Bartype.WINESTORE,100000.00,45000.00*30);
	BarDao dao10=new BarDaoImpl();
	dao.save(dto10);
	
	
	
	
	
	
	
	
	

	}

}
