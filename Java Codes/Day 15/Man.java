import java.util.HashMap;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class Man{
    private static HashMap<Integer, Student> studentMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        studentMap.put(id, new Student(id, name, age));
        System.out.println("Student added successfully.");
    }

    public static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        if (studentMap.containsKey(id)) {
            scanner.nextLine(); 
            System.out.print("Enter new Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new Age: ");
            int age = scanner.nextInt();
            studentMap.put(id, new Student(id, name, age));
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void getStudentDetail() {
        System.out.print("Enter ID to search: ");
        int id = scanner.nextInt();
        Student s = studentMap.get(id);
        if (s != null) {
            System.out.println("Student Details: " + s);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Get Student Detail");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: deleteStudent(); break;
                case 3: updateStudent(); break;
                case 4: getStudentDetail(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
