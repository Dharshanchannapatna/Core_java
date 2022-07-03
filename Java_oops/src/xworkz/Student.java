package xworkz;

class Student {
	int id;
	String name;
};
 class TestStudent2 extends Student{

	public static void main(String[] args) {
		TestStudent2 test=new TestStudent2();
		test.id=100;
		test.name="Darshi";
		System.out.println(test.id);
		System.out.println(test.name);

	}

}
