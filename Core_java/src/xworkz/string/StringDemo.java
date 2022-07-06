package xworkz.string;

public class StringDemo {

	public static void main(String[] args) {
	String name="shankar";
	String name1="shankar";
	System.out.println(name==name1);
	
	String vanitha=new String("vanitha");
	String internVanitha= vanitha.intern();
	System.out.println(vanitha==internVanitha);
	String vani ="vanitha";
	System.out.println(internVanitha==vani);
	name1="bhoomika";
	System.out.println(name==name1);
	
	}

}
