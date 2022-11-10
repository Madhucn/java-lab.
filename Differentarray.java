package differentarray;


import java.util.ArrayList;

public class Differentarray {

	public static void main(String[] args) {
	
				// create ArrayList list1
				ArrayList<String>
				Array1 = new ArrayList<String>();
				
				// Add values in ArrayList
				Array1.add("ns200");
				Array1.add("gt");
				Array1.add("bmw");
				Array1.add("kawasaki");
				

				// print list 1
				System.out.println("List1: "
								+ Array1);

				// Create ArrayList list2
				ArrayList<String>
				Array2 = new ArrayList<String>();

				// Add values in ArrayList
				Array2.add("gt");
				Array2.add("ns200");
				Array2.add("ninja");

				// print list 2
				System.out.println("List2: "
								+ Array2);

				// Find the common elements
				Array1.retainAll(Array2);

				// print list 1
				System.out.println("Common elements: "
								+ Array1);
			}
	}
