package test;

public class PrimeNumber {
	
	public static void main(String args[]){
		 int num= 17;
		 int div;
		 int flag=0;
		 div=num/2;
		 for(int i=2;i<=div;i++){
			 if(num%i==0){
			 System.out.println("num is not prime");
			 flag =1;
			 break;
			 
		 }
		 }
		 if(flag==0){
			 System.out.println("num is  prime");
		 }
	}

	}
