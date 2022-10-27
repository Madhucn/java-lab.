package demo;
import java.util.Scanner;

public class ADD8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Sc=new Scanner(System.in);
       System.out.println("enter the 4 digits");
       int num=Sc.nextInt();
       Sc.close();
       float i=((num+8)/3)%5*5;
       System.out.println("the final result is"+i);
       
	}

}
