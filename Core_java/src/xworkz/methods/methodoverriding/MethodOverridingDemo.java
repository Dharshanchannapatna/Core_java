package xworkz.methods.methodoverriding;

public class MethodOverridingDemo {
 private void m1(){
		System.out.println("method started");
	}
}
	 class Test extends MethodOverridingDemo{
		 public void   m1(int x){
			System.out.println("method ended");
		}
		 public static void main(String[] args) {
			
			 Test q=new Test();
			 q.m1(0);
	}
		 }
	 


