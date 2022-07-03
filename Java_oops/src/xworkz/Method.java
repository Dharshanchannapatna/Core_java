package xworkz;

public class Method {
     int rollno;
     String name;
     void insertRecord(int r,String n) {
    	 this.rollno=r;
    	 this.name=n;
     }
}
     class Test{
    	 public static void main(String[] args) {
    		 Method m=new Method();
    		 m.insertRecord(100, "tom");
    		 System.out.println(m.name);
			System.out.println(m.rollno);
    		 
		}
     }

