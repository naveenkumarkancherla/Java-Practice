package Collection;

import java.util.*;
class Employee{
	int id;
	String name;
	String country;
	public Employee(String name,int id,String country){
	   this.name = name;
	   this.id = id;
	   this.country = country;
   }
}
public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> l1 = new ArrayList<>();
		l1.add(new Employee("naveen",1111,"india"));
		l1.add(new Employee("modi",2222,"australia"));
		l1.add(new Employee("gnanesh",3333,"US"));
		
		System.out.println("Employee list: ");
		for(Employee emp : l1) {
			System.out.println("Id: "+emp.id+" Name: "+emp.name+" Employee country: "+emp.country);
		}
	}
}
