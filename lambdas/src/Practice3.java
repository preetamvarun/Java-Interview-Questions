package lambdas;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;


class Employee {
	String name;
	int age; 
	double salary;
	Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}


public class Practice3 {
	public static void main(String args[]) {
		Employee e1 = new Employee("Jack", 34, 23453.3434); Employee e2 = new Employee("Mandy", 24, 33453.3434);
		Employee e3 = new Employee("robert", 22, 23453.3434); Employee e4 = new Employee("Tori", 32, 33453.3434);
		Employee e5 = new Employee("Gullion", 25, 23453.3434); Employee e6 = new Employee("Blue", 37, 23453.3434);
		
		ArrayList<Employee> al = new ArrayList<>(); al.add(e1); al.add(e2); al.add(e3); al.add(e4); al.add(e5); al.add(e6);
		
		Predicate<Employee> pr_sal = (emp) -> emp.salary > 30000; 
		Predicate<Employee> pr_age = (emp) -> emp.age > 30;
		
		Consumer<Employee> cn = (e) -> {
			System.out.println("Employee name is " + e.name+ " and his salary is : " + e.salary);
		};
		
		Supplier<String> sup = () -> {
			return " More experienced and more salary";
		};
		
		Supplier<String> sup1 = () -> " less experienced and more salary";
		
		Function<Employee, String> fn = (e) -> {
			String result = "";
			if(pr_age.test(e) && pr_sal.test(e)) {
				cn.accept(e);
				result = e.name + sup.get();
			}
			else if(pr_age.negate().test(e) && pr_sal.test(e)) {
				cn.accept(e);
				result = e.name + sup1.get();
			}
			return result;
		};
		
		
		
		for(Employee e : al) {
			System.out.println(fn.apply(e));
		}
		
	}
}
