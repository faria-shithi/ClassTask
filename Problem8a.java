abstract class Employee {
    public String name;
    public int id;
    public String department;
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public abstract double calculatePay();

    public void display() {
        System.out.println("employee " + name + " ID " + id
                + "  dept " + department + "   pay " + calculatePay());


    }
}
class FullTimeEmployee extends Employee {
    public double fixedSalary;
    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }
   @Override
    public double calculatePay() {
        return fixedSalary;
    }
}
class PartTimeEmployee extends Employee {
    public double hourlyRate;
    public int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
class ContractEmployee extends Employee {
    public String projectName;
    public double contractAmount;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }
    @Override
    public double calculatePay() {
        return contractAmount;
    }
}
public class Problem8a {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("mary", 1, "IT", 50000),
            new PartTimeEmployee("liya", 2, "marketing", 30, 110),
            new ContractEmployee("ken", 3, "engineering", "Web Redesign", 84000)
        };
        for (Employee e : employees) {
            e.display();
        }
    }
}
        
