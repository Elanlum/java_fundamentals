package ru.elanlum.task5;

import lombok.val;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniversitySystem {

    private Set<Student> studentSet;
    private Set<StudentGroup> studentGroupSet;

    public UniversitySystem(){
        this.studentSet = new HashSet<>();
        this.studentGroupSet = new HashSet<>();
    }

    public void addStudent(Student student){
        studentSet.add(student);
    }

    public void addGroup(StudentGroup studentGroup){
        studentGroupSet.add(studentGroup);
    }

    public Student getStudent(Student student){
        Student foundOne = null;
        for (Student i:studentSet){
            if(i.equals(student)){
                foundOne = student;
                break;
            }
        }
        return foundOne;
    }

    public String getJournal (Student student){
        HashMap<Subject, Number> journal = new HashMap<Subject, Number>();
        if(!studentSet.contains(student)){
            throw new IllegalArgumentException();
        }
        for (StudentGroup studentGroup : studentGroupSet){
            for (Student studentInGroup : studentGroup.getStudents()){
                if(studentInGroup.equals(student))
                    journal.put(studentGroup.getStudentSubject(), studentGroup.getMark(studentInGroup));
            }
        }
        return journal.toString();
    }

}
