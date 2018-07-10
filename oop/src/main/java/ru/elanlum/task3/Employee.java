package ru.elanlum.task3;


import ru.elanlum.task3.basic.paper.Notebook;
import ru.elanlum.task3.basic.paper.PaperFormat;
import ru.elanlum.task3.basic.writingTools.Pen;

import java.awt.*;

public class Employee {

    private String name;
    private String Surname;
    private static EmployeeWorkplaceSort employeeWorkplace;

    public Employee(String name, String surname, EmployeeWorkplaceSort employeeWorkplace) {
        this.name = name;
        Surname = surname;
        this.employeeWorkplace = employeeWorkplace;
    }

    public static void setNewEmployeeWorkplace() {
        employeeWorkplace.clearStationery();
        employeeWorkplace.addStationary(new Pen("Pilot", 50, Color.BLACK, "medium"));
        employeeWorkplace.addStationary(new Pen("Pilot", 50, Color.BLACK, "medium"));
        employeeWorkplace.addStationary(new Pen("Pilot", 40, Color.BLUE, "medium"));
        employeeWorkplace.addStationary(new Pen("Pilot", 40, Color.BLUE, "medium"));
        employeeWorkplace.addStationary(new Notebook("Hatber", 60, PaperFormat.A5,
                100, Color.WHITE, Color.BLACK));
    }

    public static EmployeeWorkplaceSort getEmployeeWorkplace() {
        return employeeWorkplace;
    }

    public static void main(String[] args) {
        setNewEmployeeWorkplace();
        System.out.println(getEmployeeWorkplace());
    }
}
