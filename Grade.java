import java.util.Scanner;
class Student {
    private  int marks;
    public Student(int marks) {
        this.marks = marks;

    }
    public String getGrade() {
        if (marks < 0 || marks > 100) 
            return "invalid";
        else if (marks >= 90)  
            return "Grade: A+";
        else if (marks >= 80) 
            return "Grade: A";
         else if (marks >= 70)
            return "Grade: A-";
        else if (marks >= 60)
            return "Grade: B";
        else if (marks >= 40)
            return "Grade: C+";
         else
            return "Grade: F";
    }
    
}
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" marks: ");
        int marks = scanner.nextInt();
        Student s1 = new Student(marks);
        System.out.println(s1.getGrade());
        scanner.close();
    }
}