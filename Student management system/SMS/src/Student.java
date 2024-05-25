import java.lang.*;
public class Student {
    private  int id;
    private  String name;
    private char grade;

        public Student(int id, String name, char grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

    // Getters and setters
        public int getId() {

            return id;
        }

        public void setId(int id) {

            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setGrade(char grade) {
            this.grade = grade;
        }
        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
        }
    }

