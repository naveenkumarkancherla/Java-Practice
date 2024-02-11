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
public class AvgSalaryOfEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> l1 = new ArrayList<>();
		l1.add(new Employee("naveen",1000,"india"));
		l1.add(new Employee("modi",2000,"india"));
		l1.add(new Employee("gnanesh",3000,"US"));
		l1.add(new Employee("susmi",3300,"asia"));
		l1.add(new Employee("suresh",5000,"japan"));
		l1.add(new Employee("gnanesh",60000,"US"));
		
		System.out.print("Employee list: ");
		int avgSalary = 0;
		for(Employee emp : l1) {
			System.out.println("Id: "+emp.id+" Name: "+emp.name+" Employee country: "+emp.country);
		}
		System.out.print("Enter country: ");
		String sal = sc.nextLine();
		
		for(Employee emp : l1) {
			if(sal.equals(emp.country)) {
			   avgSalary += emp.id ; 
			}
		}
		System.out.print(avgSalary);
	}
}
