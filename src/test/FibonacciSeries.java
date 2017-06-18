package test;

public class FibonacciSeries {
	
	public static void main(String args[]){
	
		int num =2;
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1+" "+n2);
		while(num<10){
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			num++;
	}
		

	}
}
