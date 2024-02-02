import java.lang.*;

class Employee{
    static int y = 20;   // Class Variable  or static variable
    int z =30;	// Instance Variable
    public static void main(String[] args)
    {
	int x=10;	// Local variable
	System.out.println("Welcome to Java..." + x);
	System.out.println("y " + y);

	Employee emp = new Employee();   // Class instantiation
	System.out.println("z " + emp.z);
	System.out.println(emp);

	System.out.println(new Employee());
	System.out.println(new Employee());
	System.out.println(new Employee());


     } 
}