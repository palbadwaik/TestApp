package test;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Palindrom {


	public static void main(String args[]){
		String name = "nitin";
		int length= name.length();
		String rev ="";
		for(int i=length-1; i>=0;i--){
			rev=rev+ name.charAt(i);
		}
		System.out.println(rev);
		
		if(name.equalsIgnoreCase(rev)){
			System.out.println(rev+ "Palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
	}
