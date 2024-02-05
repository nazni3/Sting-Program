package two_D.Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int [] a= {4,8,2,13,5};
		int n=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<n) n=a[i]; 
		}
		System.out.println(n);

	}

}
