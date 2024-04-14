package Student;


import java.util.Scanner;

public class StudentManager {
	Scanner scanner = new Scanner(System.in);

	public void addStudentDetails(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter Student " + (i + 1) + " Details:");
			System.out.println("Enter ID: ");
			int id = scanner.nextInt();
			System.out.println("Enter Name: ");
			String name = scanner.next();
			System.out.println("Enter Roll Number: ");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter Location: ");
			String location = scanner.next();
			System.out.println("Enter Mobile No: ");
			long mobileNo = scanner.nextLong();
			System.out.println("Enter Institute Name: ");
			String instituteName = scanner.next();
			System.out.println("Enter Total Percentage: ");
			double totalPercentage = scanner.nextDouble();

			students[i] = new Student(id, name, rollNumber, location, mobileNo, instituteName, totalPercentage);
			System.out.println("Student Details Added Successfully.");
		}
	}

	public void displayAllStudents(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void searchStudentByName(Student[] students) {
		System.out.println("Enter the Name to Search Student:");
		String nameToSearch = scanner.next();
		boolean found = false;
		for (Student student : students) {
			if (student.name.equalsIgnoreCase(nameToSearch)) {
				System.out.println("Student Found:");
				System.out.println(student);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Student with name " + nameToSearch + " not found.");
		}
	}

	public void searchStudentByMobileNo(Student[] students) {
		System.out.println("Enter the Mobile No to Search Student:");
		long mobileNoToSearch = scanner.nextLong();
		boolean found = false;
		for (Student student : students) {
			if (student.mobileNo == mobileNoToSearch) {
				System.out.println("Student Found:");
				System.out.println(student);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Student with mobile no " + mobileNoToSearch + " not found.");
		}
	}

	public void searchStudentByHighestPercentage(Student[] students) {
		double maxPercentage = students[0].totalPercentage;
		Student highestPercentageStudent = students[0];
		for (int i = 1; i < students.length; i++) {
			if (students[i].totalPercentage > maxPercentage) {
				maxPercentage = students[i].totalPercentage;
				highestPercentageStudent = students[i];
			}
		}
		System.out.println("Student with Highest Percentage:");
		System.out.println(highestPercentageStudent);
	}

	public void searchStudentByLowestPercentage(Student[] students) {
		double minPercentage = students[0].totalPercentage;
		Student lowestPercentageStudent = students[0];
		for (int i = 1; i < students.length; i++) {
			if (students[i].totalPercentage < minPercentage) {
				minPercentage = students[i].totalPercentage;
				lowestPercentageStudent = students[i];
			}
		}
		System.out.println("Student with Lowest Percentage:");
		System.out.println(lowestPercentageStudent);
	}

	// Add more methods as needed
}
