package ru.elanlum.task3.basic.writingTools;

import java.awt.*;

public class Pen extends WritingStuff {

    String thicknes;

    public Pen(String producer, int price, Color writingColor, String thickness) {
        super(producer, price, writingColor);
        this.thicknes = thickness;
    }
}
