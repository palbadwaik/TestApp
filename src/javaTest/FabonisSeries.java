package javaTest;

public class FabonisSeries {
	
	public void getFabonissSeries(int num){
		int n1=0;
		int n2= 1;
		
		System.out.println(n1+" "+n2);
		for(int i = 2; i<=num;i++){
			int n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		}
	}
	

}
