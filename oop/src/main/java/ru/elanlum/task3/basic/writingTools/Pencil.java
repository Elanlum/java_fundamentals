package ru.elanlum.task3.basic.writingTools;

import java.awt.*;

public class Pencil extends WritingStuff {

    String density;

    public Pencil(String producer, int price, Color writingColor, String density) {
        super(producer, price, writingColor);
        this.density = density;
    }
}
