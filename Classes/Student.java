package Classes;

public class Student {
    int id;
    String name;
    int age;
    double gpa;
    int grade;
    int classNumber;
    String schl;

    public Student(String name, int id, int age, double gpa, int grade, int classNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.grade = grade;
        this.classNumber = classNumber;

    }


    public String info() {
        return String.format("%s is in %d years old, in the %dth grade at %s and part of class %d with a GPA of %.2f ", this.name, this.age, this.grade, this.schl, this.classNumber, this.gpa);
    }




}