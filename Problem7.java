class Student {
    public int id;
    public String name, program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public void display() {
        System.out.println("student ID " + id + " name " + name + "  program " + program);
    }
}

class Instructor {
    public int id;
    public String name,department, title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public void display() {
        System.out.println("instructor ID " + id + "  name " + name
                + "  dept " + department + "   title " + title);
    }
}
class Course {
    public int id;
    public String syllabus,title,credits, prerequisite;

    public Course(int id, String title, String syllabus, String credits, String prerequisite) {
        this.id = id;
        this.title = title;
        this.syllabus = syllabus;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public void display() {
        System.out.println("course  ID " + id + "  title " + title
                + "   credits " + credits + "  prereq " + prerequisite);
    }
}
class CourseOffering {
    public int studentID,instructorID, courseID;
    public String time;
    public int sectionNo,roomId, year;
    public String semester;

    public CourseOffering(int studentID, int instructorID, int courseID,
                          String time, int sectionNo, int roomId, int year, String semester) {
        this.studentID = studentID;
        this.instructorID = instructorID;
        this.courseID = courseID;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public void display() {
        System.out.println("courseOffering  studentID: " + studentID
                + "  instructorID: " + instructorID + "  courseID " + courseID
                + " time " + time + "  section " + sectionNo
                + "  room " + roomId + "  year " + year + "  semester " + semester);
    }
}
public class Problem7 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Amy", "computer science");
        Instructor i1 = new Instructor(10, "Dr. maxton", "CSE Department", "Professor");
        Course course = new Course(101, "Object Oriented Programming", "Java OOP concepts", "3", "programming");
        CourseOffering o1 = new CourseOffering(4, 13, 102, "10 AM", 2, 803, 2026, "se");
        s1.display();
        i1.display();
        course.display();
        o1.display();
    }
}
