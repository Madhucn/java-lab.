package demo;
import java.util.Scanner;
public class EVENorODD {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number to check its even or odd");
		value=Sc.nextInt();
		if((value%2==0))
		{
			System.out.println("the entered num is even");
		}
		else
		{
			System.out.println("the entered num is odd");
		}
	}

}
