package two_D.Arrays;

public class DiagonalNumbers {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		int r=a.length;
		for(int i=0;i<r;i++) {
			sum+=a[i][i];
			
			if(r%2!=0 && i==r/2)continue;
			
			sum+=a[i][r-1-i];
		}
		System.out .println(sum);

	}

}
