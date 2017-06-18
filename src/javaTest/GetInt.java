package javaTest;

public class GetInt {

	int reversedNum;
	int input =1234;
	public void testInt(){
		while (input != 0) {
		    reversedNum = reversedNum * 10 + input % 10;
		    input = input / 10;   
		}
		System.out.println(reversedNum);
	}
	public static void main(String args[]){
		
	}
}
