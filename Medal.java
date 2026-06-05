class Student {
    double letterGrade;
    boolean Completed;

    Student(double letterGrade, boolean Completed) {
        this.letterGrade = letterGrade;
        this.Completed = Completed;
    }

    String checkMedal() {
        if (Completed) {
            if (letterGrade >= 3.5) 
                return "receive medal";
         else 
                return "No medal. Grade is below 3.5.";
        }
         else 
            return "no medal";
    
    }
}
public class Medal {
    public static void main(String[] args) {
        Student s1 = new Student(3.5, true);
        System.out.println(s1.checkMedal());
        Student s2 = new Student(3.0, true);
        System.out.println(s2.checkMedal());
        Student s3 = new Student(3.8, false);
        System.out.println(s3.checkMedal());
        Student s4 = new Student(2.9, true);
        System.out.println(s4.checkMedal());
        Student s5= new Student(3.8, true);
        System.out.println(s5.checkMedal());
    }
}
