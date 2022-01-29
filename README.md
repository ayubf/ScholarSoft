# ScholarSoft: Mock School Online Management Site

## Goals

I think I'm starting to use Java more and more and I've recently been working on something like this but in Python. 

## Classes
-  School
-  Grades
-  Classes
-  Students
-  Teachers


Every grade has a set number of students. Every class has a set number of students. Classes also have students but also one teacher per class. Grades can have a number of teachers.


### Class Breakdown

This is supposed to be modeled after the management system that a high school would use so the grades are high school grades. Four grades, 9th-12th, with 50 class per grade maximum and 20 students per class maximum. 



## Directory Tree
        📦ScholarSoft 
        ┣ 📂Classes
        ┃ ┣ 📜School.java       
        ┃ ┣ 📜Class.java 
        ┃ ┣ 📜Grade.java 
        ┃ ┣ 📜Student.java 
        ┃ ┗ 📜Teacher.java
        ┣ 📜README.md 
        ┗ 📜Main.java 


The ```Classes``` folder is meant for the classes to create the objects needed. The ``Main.java`` file is where the driver code is. 

## Methods

### ``void add(obj)``

Adds a student, teacher, or class to a grade, or class.
``obj`` is the object in question, the one being inserted

### ``void drop(obj)`` 

Drops a student, teacher, or class from a grade or class.
``obj`` is the object in question being removed.

### ``String info()``

Returns the summary of information of an object.

### ``int size()``

Returns the size of a class


### ``double ratio()``

Returns the teacher to student ratio of a school.
