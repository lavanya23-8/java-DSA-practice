import java.util.Scanner;

class Student {
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    students[count++] = new Student(roll, name, marks);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n----- All Students -----");
                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    roll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].roll == roll) {
                            System.out.println("Student Found:");
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < count; i++) {
                        sum += students[i].marks;
                    }
                    double avg = (count > 0) ? (double) sum / count : 0;
                    System.out.println("Average Marks = " + avg);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
