package test;

public class TestConstructor {
	
	/*public TestConstructor(int x, int y){
		int z=x+y;
		System.out.println(z);
	}
	
	public void test(){
		
	}*/
	
	public static void main(String[] args){
		//TestConstructor tc = new TestConstructor(10, 10);
		//TestConstructor tc1 = new TestConstructor(20, 20);
		TestConstructor tc = new TestConstructor();
		System.out.println(tc instanceof TestConstructor);
	}
}
