package task10;

 class Employee {  // implement Employee class 
    public int id; 
    public String name; 
    public double salary; // Declaring attributes
 
    public Employee(int id, String name, double salary) { 
        this.id = id; 
        this.name = name; 
        this.salary = salary; 
    } 
 
    public void raiseSalary(double percent) { // Method()
        salary += salary * percent / 100; 
    } 
 
    public int getId() { 
        return id; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public double getSalary() { 
        return salary; 
    } 
} 


public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(714, "Michel", 45000); 
		System.out.println("Before raise: " + employee.getSalary()); 
		
		employee.raiseSalary(10); 
		System.out.println("After raise: " + employee.getSalary()); 

	}

}
