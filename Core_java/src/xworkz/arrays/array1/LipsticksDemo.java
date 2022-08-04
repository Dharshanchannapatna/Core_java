package xworkz.arrays.array1;

public class LipsticksDemo {

	public static void main(String[] args) {
		Lipstick lakme=new Lipstick("lakme","black", 10.00);
		Lipstick mac=new Lipstick("mac","pink",5.00);
		Lipstick maglamm=new Lipstick("maglamm","yellow", 2.00);
		Lipstick sugar=new Lipstick("sugar","green",3.00);
		Lipstick maybeline =new Lipstick("maybeline","red", 350);
		Lipstick [] lipsticks= {lakme,mac,maglamm,sugar,maybeline};
		for(int i=0; i<lipsticks.length;i++) {
			if(lipsticks[i].price<10.00) {
				System.out.println(lipsticks[i]);	
			}
		}
		System.out.println();
	}

}
