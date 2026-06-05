class Employee {
    double Sales;
    double Attendance;
    Employee(double Sales, double Attendance) {
        this.Sales = Sales;
        this.Attendance = Attendance;
    }
    int Calculate() {
        if (Sales >= 95 && Attendance == 100) 
            return 60;
        else if (Sales >= 95 && Attendance >= 90) 
            return 40;
         else if (Sales >= 80 && Attendance == 100) 
            return 40;
         else if (Sales >= 80 && Attendance >= 90) 
            return 20;
         else 
            return 5;
        
    }
}

public class Bonus {
    public static void main(String[] args) {
        Employee e1 = new Employee(95, 100);
        System.out.println("Bonus: " + e1.Calculate() + "%");


        Employee e2 = new Employee(95, 90);
        System.out.println("Bonus: " + e2.Calculate() + "%");

        Employee e3 = new Employee(80, 100);
        System.out.println("Bonus: " + e3.Calculate() + "%");

        Employee e4 = new Employee(80, 90);
        System.out.println("Bonus: " + e4.Calculate() + "%");
        
        Employee e5 = new Employee(70, 85);
        System.out.println("Bonus: " + e5.Calculate() + "%");
    }
}