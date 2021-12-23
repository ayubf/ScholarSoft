import java.util.ArrayList;

import Classes.*;
import Classes.Class;

public class Main{
    public static void main(String[] args) {

        Student st1 = new Student("Foo Bar", 0001,15,3.7,10,0);
        Student st2 = new Student("Foo Bar", 0002,14,2.1,10,0);
        Student st3 = new Student("Foo Bar", 0003,14,3.45,10,0);
        Student st4 = new Student("Foo Bar", 0004,15,3.9,10,0);


        ArrayList<String> subj = new ArrayList<String>();
        subj.add("English");
        
        Teacher tch1 = new Teacher(01, "Fizz Buzz",   subj, 32, 0);

        Class tenZero = new Class(00, 10, tch1);
        tenZero.add(st1);
        tenZero.add(st2);
        tenZero.add(st3);
        tenZero.add(st4);
        tenZero.drop(st2);


        Grade tenth = new Grade(10);

        tenth.add(st1);
        tenth.add(st3);
        tenth.add(st4);

        tenth.add(tch1);

        tenth.add(tenZero);


        School sch1 = new School("Dijkstra High School");

        sch1.add(st1);
        sch1.add(st3);
        sch1.add(st4);

        sch1.add(tch1);

        sch1.add(tenZero);

        sch1.add(tenth);

        System.out.println(st4.info());
        System.out.println(tch1.info());
        System.out.println(tenZero.info());
        System.out.println(tenth.info());
        System.out.println(sch1.info());
    }
}