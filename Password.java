package demo;
import java.util.Scanner;

public class Password {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x,y;
		  Scanner Sc=new Scanner(System.in);
	       System.out.println("enter your password");
		   x=Sc.nextInt();
		   System.out.println("confirm your password");
		   y=Sc.nextInt();
         if(x!=y)
        	 System.out.println("error");
         else
        	 System.out.println("pass");
		
	}

}
