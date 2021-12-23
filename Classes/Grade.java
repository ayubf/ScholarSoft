package Classes;

import java.util.*;

public class Grade {
    public int num;
    public String schl;

    HashMap<Integer, HashMap<String, Object>> Students = new HashMap<Integer, HashMap<String, Object>>();
    HashMap<Integer, HashMap<String, Object>> Teachers = new HashMap<Integer, HashMap<String, Object>>();
    HashMap<Integer, HashMap<String, Object>> Classes = new HashMap<Integer, HashMap<String, Object>>();

    public Grade(int num) {
        this.num = num;
    }

    public String info() {
        return String.format("%s's %dth grade is comprised of %d student(s) and %d teacher(s) split into %d classe(s)", this.schl, this.num, this.studentNum(), this.teacherNum(), this.classNum());
    }

    public void add(Student stu) {
        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", stu.id);
        information.put("Name", stu.name);
        information.put("Age", stu.age);
        information.put("Grade Point Average", stu.gpa);
        information.put("Grade", stu.grade);
        information.put("Class", stu.classNumber);
        this.Students.put(stu.id, information); 
    }

    public void add(Teacher teach) {

        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", teach.id);
        information.put("Name", teach.name);
        information.put("Subjects", teach.subjects);
        information.put("Age", teach.age);
        information.put("Class", teach.classNumber);
        this.Teachers.put(teach.id, information);
    }

    public void add(Class cl) {
        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", cl.id);
        information.put("Grade", cl.grade);
        information.put("Teacher", cl.teach.id);
        information.put("Students", cl.Students);
        this.Classes.put(cl.id, information);
    }

    public void drop(Teacher teach) {
        this.Teachers.remove(teach.id);
    }

    public void drop(Class cl) {
        this.Classes.remove(cl.id);
    }

    public void drop(Student stu) {
        this.Students.remove(stu.id);
    }

    public void drop(int type, int id) {
        
        switch(type) {
            case 0:
                this.Students.remove(id);
            case 1:
                this.Teachers.remove(id);
            case 3:
                this.Classes.remove(id);
        }


    }

    public int studentNum() {
        return this.Students.size();
    }

    public int teacherNum() {
        return this.Teachers.size();
    }

    public int classNum() {
        return this.Classes.size();
    }

}