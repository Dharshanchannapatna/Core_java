package xworkz.arrays.arrayassignment;

public class WatchDemo {

	public static void main(String[] args) {
		Watch rado=new Watch("rado","gold",500.00);
		Watch fasttrack=new Watch("fasttrack","black",100.00);
		Watch boat=new Watch("boat","yellow",300.00);
		Watch mi=new Watch("mi","white",500.00);
		Watch titan=new Watch("titan","silver",850.00);
		Watch[] watch= {rado,fasttrack,boat,mi,titan};		
for(int i=0;i<watch.length;i++) {
	if(watch[i].price<=500) {
		System.out.println(watch[i]);
	}
}
	}

}
