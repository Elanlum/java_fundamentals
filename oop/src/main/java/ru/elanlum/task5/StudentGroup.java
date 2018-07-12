package ru.elanlum.task5;

import java.util.HashMap;
import java.util.Set;

public class StudentGroup {
    private final Subject studentSubject;
    private HashMap<Student, Number> studentMarkMap;

    StudentGroup(Subject studentSubject) {
        this.studentSubject = studentSubject;
        this.studentMarkMap = new HashMap<>();
    }

    public void addStudent (Student student, String mark){
    if (studentSubject.getMarkType() == MarkType.INTEGER)
        this.studentMarkMap.put(student, (Integer)MarkType.INTEGER.getMark(mark));
    else if (studentSubject.getMarkType() == MarkType.FLOAT)
        this.studentMarkMap.put(student, (Float)MarkType.FLOAT.getMark(mark));
    }

    public Subject getStudentSubject() {
        return studentSubject;
    }

    public Number getMark (Student student){
        return studentMarkMap.get(student);
    }

    public Set<Student> getStudents(){
        return studentMarkMap.keySet();
    }
}
