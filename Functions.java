package demo;
import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//to get the input
		
		String str=sc.next();//to get the string as input
		System.out.println("the length of string is"+str.length());//shows the length of the string
		System.out.println("get the character position");//  
		int a=sc.nextInt();//to get the position of the string
		System.out.println("the position of string is:"+str.charAt(a));//shows the position of the string that is given by user
		System.out.println("the uppercase of string is:"+str.toUpperCase());//converts string to upper case
		System.out.println("the lowercase of string is:"+str.toLowerCase());//converts  string to lower case
		System.out.println("the concat of string is:"+str.concat("-is my fav actor"));//concats the given word
	
		
		
		
	}

}
