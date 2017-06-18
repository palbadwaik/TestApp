
public class Reddedunt {

	public static void main(String[] args) {
		String name="pallavi";
		String redundant = "";
		int size = name.length();
		for(int i =0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(name.charAt(i)!=name.charAt(j)){
					redundant = redundant+name.charAt(i);
				}
			}
		}
		System.out.println(redundant);
	}
}
