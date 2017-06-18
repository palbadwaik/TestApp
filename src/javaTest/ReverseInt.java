package javaTest;

public class ReverseInt {
	int reversedNum;
	int input =1234;
	static int i;
	public void getInt(){
	while (input != 0) {
	    reversedNum = reversedNum * 10 + input % 10;
	    input = input / 10;   
	}
	System.out.println(reversedNum);
	}
public static void main(String args[]){
	ReverseInt rt = new ReverseInt();
	rt.getInt();
}
}
