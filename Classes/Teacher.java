package Classes;

import java.util.*;

public class Teacher {
    int id;
    String name;
    ArrayList<String> subjects;
    int age;
    int classNumber;
    String schl;

    public Teacher(int id, String name, ArrayList<String> subjects, int age, int classNumber) {

        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.age = age;
        this.classNumber = classNumber;
    

    }

    public String info() {
        String inf = String.format("%s is %d years old, teaches ", this.name, this.age);
        for (int i = 0;i < this.subjects.size();i++) {
            if (i != this.subjects.size()) {
                inf+=String.format("%s,",this.subjects.get(i));
            } else {
                inf+=String.format(", and %s ", this.subjects.get(i));
            }
        }
        inf+=String.format(" at %s and teaches Class %d.", this.schl, this.classNumber);

        return inf;
    }

    public void assignClass(int val) {
        this.classNumber = val;
    }





}