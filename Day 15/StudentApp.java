import java.util.HashMap;
import java.util.Map;

public class StudentApp {

    // Student Class
    static class Student {
        private int studentId;
        private String studentName;
        private static final String COLLEGE = "Nandha";
        private HashMap<String, Integer> subjects;

        // Constructor
        public Student(int studentId, String studentName, HashMap<String, Integer> subjects) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.subjects = subjects;
        }

        // Method to print student info
        public void printStudentInfo() {
            System.out.println("------ Student Information ------");
            System.out.println("Student ID   : " + studentId);
            System.out.println("Student Name : " + studentName);
            System.out.println("College      : " + COLLEGE);
            System.out.println("Subjects and Marks:");
            for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
                System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
            }
        }

        // Method to check pass/fail
        public void checkStudentPassOrFail() {
            boolean allPassed = true;
            for (int mark : subjects.values()) {
                if (mark < 50) {
                    allPassed = false;
                    break;
                }
            }
            if (allPassed) {
                System.out.println("Status: Passed ✅");
            } else {
                System.out.println("Status: Failed ❌");
            }
        }

        // Method to calculate percentage
        public double getStudentPercentage() {
            int total = 0;
            for (int mark : subjects.values()) {
                total += mark;
            }
            double percentage = (double) total / subjects.size();
            System.out.println("Percentage: " + percentage + "%");
            return percentage;
        }
    }

    // Main Method
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Maths", 85);
        marks.put("Physics", 72);
        marks.put("English", 48); // Below pass mark

        Student s1 = new Student(101, "Arjun", marks);

        s1.printStudentInfo();
        s1.checkStudentPassOrFail();
        s1.getStudentPercentage();
    }
}
