import java.util.ArrayList;


public class test {

	
public static void main(String[] args){
	String name ="pallavi";
	int nameLengh= name.length();
	ArrayList<String> arr = new ArrayList<String>();
	for(int i=0; i<nameLengh;i++){
		for(int j=1; j<nameLengh; j++)
		if(name.charAt(i)!=name.charAt(j)){
			arr.add("p");
			//arr.add(name.charAt(i));
			
		}
	}
}
}