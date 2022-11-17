package demo;

public class Peter {

	 static void check(int num) 
			 throws Gameexception//this is user defined exception
	 {
		// TODO Auto-generated method stub
		 
		 
			if(num>3)//checks the given num is 1,2,3 
			 {
				 throw new Gameexception(""); //throws the exception if doesn't match
			 }
		 }
	
public static void main(String[]args)
{
	try
	{
check(0);
	}
	catch(Exception e) {
		System.out.println(e);

	}

}
}
