package two_D.Arrays;

public class Dmeo2 {

	public static void main(String[] args) {
		int [][] a=new int [3][];
		a[0]= new int[3];
		a[1]= new int[4];
		a[2]=new int[2];
		
		for(int[]b:a) {
			for(int n:b) {
				System.out .print(n);
			}
			System.out .println();
		}

	}

}
