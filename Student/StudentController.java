package Student;


import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3]; // Assuming 3 students initially

        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("\nEnter Choice:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Search Student by Mobile No");
            System.out.println("5. Search Student by Highest Percentage");
            System.out.println("6. Search Student by Lowest Percentage");
            System.out.println("7. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.addStudentDetails(students);
                    break;
                case 2:
                    studentManager.displayAllStudents(students);
                    break;
                case 3:
                    studentManager.searchStudentByName(students);
                    break;
                case 4:
                    studentManager.searchStudentByMobileNo(students);
                    break;
                case 5:
                    studentManager.searchStudentByHighestPercentage(students);
                    break;
                case 6:
                    studentManager.searchStudentByLowestPercentage(students);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 7);
    }
}
