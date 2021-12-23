package Classes;


import java.util.*;



public class School {
    String name;
    
    public HashMap<Integer, HashMap<String, Object>> Students = new HashMap<Integer, HashMap<String, Object>>(); // 0
    public HashMap<Integer, HashMap<String, Object>> Teachers = new HashMap<Integer, HashMap<String, Object>>(); // 1
    public HashMap<Integer, HashMap<String, Object>> Grades = new HashMap<Integer, HashMap<String, Object>>(); // 2
    public HashMap<Integer, HashMap<String, Object>> Classes = new HashMap<Integer, HashMap<String, Object>>(); // 3
    



    public School(String n) {
        this.name = n;
    }

    public String info() {
        return String.format("%s is a school with %d student(s), %d teacher(s) , into %d classe(s) with a ratio of %.2f student:teacher", this.name, this.studentNum(),this.teacherNum(), this.classNum(), this.ratio());

    }

    public void add(Student stu) {
        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", stu.id);
        information.put("Name", stu.name);
        information.put("Age", stu.age);
        information.put("Grade Point Average", stu.gpa);
        information.put("Grade", stu.grade);
        information.put("Class", stu.classNumber);
        stu.schl = this.name;
        this.Students.put(stu.id, information);

    }


    public void add(Teacher teach) {

        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", teach.id);
        information.put("Name", teach.name);
        information.put("Subjects", teach.subjects);
        information.put("Age", teach.age);
        information.put("Class", teach.classNumber);
        teach.schl = this.name;
        this.Teachers.put(teach.id, information);
    }

    public void add(Class cl) {
        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", cl.id);
        information.put("Grade", cl.grade);
        information.put("Teacher", cl.teach.id);
        information.put("Students", cl.Students);
        cl.schl = this.name;
        this.Classes.put(cl.id, information);
    }

    public void add(Grade gr) {
        HashMap<String, Object> information = new HashMap<String, Object>();
        information.put("ID", gr.num);
        information.put("Students", gr.Students);
        information.put("Teacher", gr.Teachers);
        information.put("Classes", gr.Classes);
        gr.schl = this.name;
        if (this.Grades.containsKey(gr.num)) {
            this.Grades.remove(gr.num);
            this.Grades.put(gr.num, information);
        }


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
    };
    public int teacherNum() {
        return this.Teachers.size();
    }
    public int classNum() {
        return this.Classes.size();
    }

    public int size() {
        return this.teacherNum()+this.studentNum();
    }

    public double ratio() {
        double res = this.studentNum()/this.teacherNum();
        return res;
    }




}
