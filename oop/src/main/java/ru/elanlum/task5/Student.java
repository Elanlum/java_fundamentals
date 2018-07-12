package ru.elanlum.task5;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String lastname;
    private Grade frade;
}
