package javaTest;

public class ReverseString {
	 public static String  getRevString(String line){
		 
		int strLength = line.length();
		String revStr="";
		for(int i=strLength-1; i>=0;i--){
			revStr =revStr+line.charAt(i);
		}
		System.out.println(line.equals(revStr));
		System.out.println(strLength);
		System.out.println(revStr);
		return revStr;
	 }

}
