package day8;
import java.util.*;
class Employee{
	String name;
	String department;
	int salary;
	Employee(String name,String department,int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
		
	}
	public String toString() {
		return name +" -"+ department +"-"+salary;
		
	}
}

public class customcompator {
	public static void main(String[] args) {
		
		List<Employee>employees=Arrays.asList(
				new Employee("Ravi","IT",90000),
				new Employee("abhi","HR",80000),
				new Employee("babbi","tester",70000),
				new Employee("priya","AT",50000)
				);
		employees.sort(
				Comparator.comparing((Employee e) -> e.department).thenComparing((Employee e) -> e.salary,Comparator.reverseOrder()).thenComparing(e -> e.name));
		for(Employee e:employees) {
			System.out.println(e);
		}
	}

}
