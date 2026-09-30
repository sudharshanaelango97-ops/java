File: Student.java
package mypackage;
public class Student {
    private int rollNo;
    private String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}
File: Main.java

import mypackage.Student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        Student s = new Student(rollNo, name);
        System.out.println("\nStudent Details");
        System.out.println("----------------");
        s.display();
        sc.close();
    }
}
Folder Structure
Project
│
├── mypackage
│   └── Student.java
│
└── Main.java

Compilation and Execution:

javac -d . mypackage/Student.java
javac Main.java
java Main


