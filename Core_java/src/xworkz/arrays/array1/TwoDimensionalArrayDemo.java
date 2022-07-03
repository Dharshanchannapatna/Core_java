package xworkz.arrays.array1;

public class TwoDimensionalArrayDemo {
	public static void main(String[] args) {
		
	
    int[][] a=new int[3][3];
int num=1;
for (int i=0; i<a.length; i++) {
	for (int j=0; j<a[i].length;j++) {
		a[i][j]=num;
		num++;
		
	}
}
for (int i=0; i<a.length; i++) {
	for (int j=0; j<a[i].length;j++) {
		System.out.print(a[i][j]+" ");
	}
}
System.out.println();
}
}