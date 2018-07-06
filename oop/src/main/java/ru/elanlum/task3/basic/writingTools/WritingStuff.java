package ru.elanlum.task3.basic.writingTools;

import ru.elanlum.task3.basic.AbstractStationery;

import java.awt.*;

public abstract class WritingStuff extends AbstractStationery {

    Color writingColor;

    public WritingStuff(String producer, int price, Color writingColor) {
        super(producer, price);
        this.writingColor = writingColor;
    }
}
