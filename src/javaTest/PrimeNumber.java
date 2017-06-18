package javaTest;
public class PrimeNumber {
	public void getprimeNumber(int num){
		if(num<2){
			System.out.println(num+ "is not prime number");
		}
		else{
			int divNum = num/2;
			boolean flag=false;
			for(int i =2; i<=divNum; i++){
				int r= num%i;
				if(r==0){
					flag=false;
					break;
				}
			}
			if(flag==false){
				System.out.println("It is prime number");
			}
			else{
				System.out.println("It is not prime number");
			}
		}

	}

}
