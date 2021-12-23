package Classes;

import java.util.*;

public class Class {
    
    int id;
    int grade;
    String schl;

    Teacher teach;

    public HashMap<Integer, HashMap<String, Object>> Students = new HashMap<Integer, HashMap<String, Object>>();
    
    
    public Class(int id, int grade, Teacher teach) {
        this.id = id;
        this.grade = grade;
        this.teach = teach;
    }

    public String info() {
        return String.format("%s's %dth grade's Class %d has %d student(s) and is taught by %s", this.schl, this.grade, this.id, this.size(), this.teach.name);
    }



    public int size() {
        return this.Students.size();
    }

    public void add(Student stu) {
        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", stu.id);
        information.put("Name", stu.name);
        information.put("Age", stu.age);
        information.put("Grade Point Average", stu.gpa);
        information.put("Grade", stu.grade);
        stu.classNumber = this.id;
        information.put("Class", stu.classNumber);
        this.Students.put(stu.id, information);

    }

    public void reassignTeacher(Teacher teach) {
        this.teach = teach;
    }

    public void drop(Student stu) {
        this.Students.remove(stu.id);
    }


}