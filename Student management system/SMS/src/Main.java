import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;

        String Student ;

        String gradeinput ;

        char grade;



        System.out.println("Enter 1 for displaying students," +
                "Enter 2 for updating student details," +
                "Enter 3 search for a student," +
                "Enter 4 for deleting student" +
                "Enter 5 for adding Student");
        int operation = Integer.parseInt(sc.nextLine());


        StudentManagementSystem sms = new StudentManagementSystem();

        // Create new students
//        sms.addStudent(new Student(1, "Alice", 'A'));
//        sms.addStudent(new Student(2, "Bob", 'B'));
//        sms.addStudent(new Student(3, "Ramesh", 'B'));
//        sms.addStudent(new Student(4, "Sanjay", 'C'));


        while (operation>0 && operation<=5) {

            switch (operation) {
                case 1:
                    // Read and display students
                    System.out.println("Students List:");
                    sms.viewStudents();
                    break;
                case 2:
                    // Update student's details
                    sms.updateStudent(2, "Robert", 'A');
                    System.out.println("\nAfter updating Bob's details:");
                    sms.viewStudents();
                    break;
                case 3:
                    // Search for a student by name
                    System.out.println("\nSearching for Ramesh:");
                    Student foundStudent = sms.searchStudentByName("Ramesh");
                    System.out.println(foundStudent != null ? foundStudent : "Student not found.");
                    break;
                case 4:
                    // Delete a student
                    sms.deleteStudent(1);
                    System.out.println("\nAfter deleting Alice:");
                    sms.viewStudents();
                    break;
                case 5:
                    System.out.print("Enter id ");
                     id = Integer.parseInt(sc.nextLine());


                     System.out.print("Enter  name ");
                        Student = sc.nextLine();


                     System.out.print("Enter grade ");
                        gradeinput = sc.nextLine();
                    while (true) {
                        //  System.out.println("Enter character which is between A and F");

                        while (gradeinput.length() != 1) {
                            System.out.println("Enter grade cannot be empty");
                            gradeinput = sc.nextLine();

                        }
                        grade = gradeinput.charAt(0);
                        gradeinput = "";
                        if (grade >= 'A' && grade <= 'F') {
                            break;
                        }
                        System.out.println("Enter character which is between A and F");
                    }
                    sms.addStudent(new Student(id, Student, grade));
                    break;

            }
            System.out.println("Want Anymore ");
            operation=Integer.parseInt(sc.nextLine());
        }
    }
}