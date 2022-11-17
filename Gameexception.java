package demo;



	 public class Gameexception extends Exception{
		 public Gameexception(String str)
		 {
			 super(str);
			 System.out.println("the number doesn't match");
		 }
	 }
