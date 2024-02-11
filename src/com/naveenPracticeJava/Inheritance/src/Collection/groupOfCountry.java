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
public class groupOfCountry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> l1 = new ArrayList<>();
		ArrayList<String> india = new ArrayList<>();
		ArrayList<String> japan = new ArrayList<>();
		ArrayList<String> US = new ArrayList<>();
		
		l1.add(new Employee("naveen",1000,"india"));
		l1.add(new Employee("modi",2000,"india"));
		l1.add(new Employee("kumar",3000,"US"));
		l1.add(new Employee("susmi",3300,"japan"));
		l1.add(new Employee("suresh",5000,"japan"));
		l1.add(new Employee("gnanesh",60000,"US"));
		
		System.out.print("Employee list: ");
		int avgSalary = 0;
		for(Employee emp : l1) {
			System.out.println("Id: "+emp.id+" Name: "+emp.name+" Employee country: "+emp.country);
		}
		for(Employee emp: l1) {
			if((emp.country).equals("india")) {
				india.add(emp.name);
			}
			else if((emp.country).equals("japan")) {
				japan.add(emp.name);
			}
			else {
				US.add(emp.name);
			}
		}
		System.out.println("India");
		for(String item : india) {
			System.out.println("  - "+item);
		}
		System.out.println("japan");
		for(String item : japan) {
			System.out.println("  - "+item);
		}
		System.out.println("US");
		for(String item : US) {
			System.out.println("  - "+item);
		}
		
	}
}
