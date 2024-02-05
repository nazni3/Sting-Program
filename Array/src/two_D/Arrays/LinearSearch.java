package two_D.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a= {4,8,2,10,24,6};
		System.out.println(Search(a,10));
		//System.out.println(Search(a,16));

	}
	
	static int Search(int[]a,int e) {
		for(int i=0;i<a.length;i++) {
			if(e==a[i]) return i; 
			}
		return -1;
	}

}
