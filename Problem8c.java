public class Problem8c {

    public static void main(String[] args) {
        int numStudents = 5;
        int numSubjects = 5;
        double[] credits = {3, 3, 4, 2, 3};
        double[][] gradePoints = {
            {4.0, 3.5, 3.75, 4.0, 3.0},  
            {3.2, 2.8, 3.9, 2.8, 4.0},             
            {2.8, 3.0, 3.7, 3.0, 3.7}, 
            {4.0, 4.0, 3.3, 3.7, 3.0},  
            {3.5, 4.0, 3.0, 3.7, 3.3}   
        };

        System.out.println("Student CGPA Results ");
        for (int i = 0; i < numStudents; i++) {
            double weightedSum = 0;
            double totalCredits = 0;
            for (int j = 0; j < numSubjects; j++) {
                weightedSum += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }
            double cgpa = weightedSum / totalCredits;
            System.out.printf(" %d CGPA = % .2f%n", (i + 1), cgpa);
        }
    }

}