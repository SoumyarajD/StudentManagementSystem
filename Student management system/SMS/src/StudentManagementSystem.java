import java.util.*;
public class StudentManagementSystem {

        private final List<Student>students = new ArrayList<>();

        // Create (Add) a student
        public void addStudent(Student student) {
            students.add(student);
        }

        // Read (View) all students
        public void viewStudents() {
            for(Student eachstudent: students){
                System.out.println(eachstudent);
            }
        }

        // Update a student's details
        public void updateStudent(int id, String newName, char newGrade) {
            for (Student s : students) {
                if (s.getId() == id) {
                    s.setName(newName);
                    s.setGrade(newGrade);
                    break;
                }
            }
        }

        // Delete a student by ID
        public void deleteStudent(int id) {
            students.removeIf(student->student.getId() == id);
        }

        // Search student by name
        public Student searchStudentByName(String name) {
            for (Student s : students) {
                if (s.getName().equalsIgnoreCase(name)) return s;
            }
            return null;
        }
    }
