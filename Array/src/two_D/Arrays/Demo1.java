package two_D.Arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[][] a=new int[3][4];
		
		for(int[]n:a) {
			//System.out .println(Arrays.toString(n));
			for( int e:n) {
				System.out .print(e);
			}
			System.out .println();
		}

	}

}
