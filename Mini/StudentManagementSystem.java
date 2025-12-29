package Mini;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private int age;
	private String course;
	
	public Student(int id, String name, int age, String course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String toString() {
		return "Student ID : " + id +
				", Name : " + name +
				", Age : " + age +
				", Course : " + course;
	}
	
}

public class StudentManagementSystem {
	
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("\n------- Student Management System ----------");
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Search Student by ID");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("0. Exist");
			System.out.println("Enter your Choice : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 -> addStudent();
			case 2 -> viewStudent();
			case 3 -> searchStudent();
			case 4 -> updateStudent();
			case 5 -> deleteStudent();
			case 0 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid choice. Try again.");
			
			}
		}
		while( choice != 0);

	}
	
	private static void addStudent() {
		System.out.println("Enter Student ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course : ");
		String course = sc.nextLine();
		
		students.add(new Student(id, name, age, course));
		System.out.println("Student added successfully");
	}
	
	private static void viewStudent() {
		if(students.isEmpty()) {
			System.out.println("No students to display");
		} else {
			for(Student s : students) {
				System.out.println(s);
			}
		}
	}
	
	private static void searchStudent() {
		System.out.println("Enter student ID to search : ");
		int id = sc.nextInt();
		for(Student s : students) {
			if(s.getId() == id) {
				System.out.println("Student found : \n" + s);
			}
		}
	}
	
	private static void updateStudent() {
		System.out.println("Enter Student ID TO update : ");
		int id = sc.nextInt();
		for(Student s : students) {
			if (s.getId() == id) {
				sc.nextLine(); // consume newline
				System.out.println("Enter new Name : ");
				s.setName(sc.nextLine());
				System.out.println("Enter new Age : ");
				s.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter new Course : ");
				s.setCourse(sc.nextLine());
				System.out.println("Student updated successfully.");
				return;
			}
		}
		System.out.println("Student not found.");
	}

	private static void deleteStudent() {
		System.out.println("Enter Student ID to delete : ");
		int id = sc.nextInt();
		for (Student s : students) {
			if(s.getId() == id) {
				students.remove(s);
				System.out.println("Student deleted successfully.");
				return;
			}
		}
		System.out.println("Student not found");
	}
	
}
