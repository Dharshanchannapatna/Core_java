package xworkz.methods.methodoverriding;

 class P {
	public void property() {
		
	}
	public void marriage() {
		System.out.println("surabhi");
		
	}
 }
 
	 class C extends P{
		 public void marriage() {
				System.out.println("rani");
				
			}
		 
		public static void main(String[] args) {
			P p=new P();
			p.marriage();
			 C c=new C();
			 c.marriage();
			 P v=new C();;;;
			 v.marriage();
			
			 
			
			
		}
	}
 
  
