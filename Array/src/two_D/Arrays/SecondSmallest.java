package two_D.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int [] a= {7,9,2,5,11};
		int n1=a[0];
		int n2=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]==n1) continue;
			if(a[i]<n1) {
				n2=n1;
				n1=a[i];
			}
			else if(n1==n2||a[i]<n2) {
				n2=a[i];
			}
			
		}
		System.out.println(n2);
		

	}

}
