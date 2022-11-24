package demo;

class ParentClass {
	  public void print() {
	    System.out.println("This is parent class");
	  }
	}

	class ChildClass extends ParentClass {
	  public void print() {
	    System.out.println("This is child class");
	  }
	}

	public class MainObj {
	  public static void main(String[] args) {
	    ParentClass parent = new ParentClass();
	    ChildClass child = new ChildClass();
	    ParentClass obj = new ChildClass();
	    
	    parent.print();
	    child.print();
	    obj.print();
	    
	  }
	}