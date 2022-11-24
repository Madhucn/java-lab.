package demo;

class Member { 
	  
    // Data Members 
    String name; 
    int age; 
    long phone_no; 
    String address; 
    double salary; 
  
    // Method to print the salary. 
    void printSalary() 
    { 
        System.out.println("Salary:" + salary); 
    } 
} 
  
// Employee class inherits the Member class. 
class Employee extends Member { 
  
    String specialization; 
  
    // Assigning the values to the data members of the Employee class. 
    Employee(String name, int age, long phone_no, String address, double salary, String specialization) 
    { 
        this.name = name; 
        this.age = age; 
        this.phone_no = phone_no; 
        this.address = address; 
        this.salary = salary; 
        this.specialization = specialization; 
    } 
} 
  
// Manager class inherits the Member class. 
class Manager extends Member { 
  
    String department; 
  
    // Assigning the values to the data members of the Manager class. 
    Manager(String name, int age, long phone_no, String address, double salary, String department) 
    { 
        this.name = name; 
        this.age = age; 
        this.phone_no = phone_no; 
        this.address = address; 
        this.salary = salary; 
        this.department = department; 
    } 
} 
  
// Code to create an object of the Employee class and print the values. 
class Members { 
    public static void main(String[] args) 
    { 
  
        Employee e = new Employee("John", 24, 9000000000L, "Patna", 30000, "Programmer");
        Manager m= new Manager("Toni", 20, 6432342332L, "bangarapet", 67000, "Bug Hunter");
  
        e.printSalary(); 
        m.printSalary();
    } 
}