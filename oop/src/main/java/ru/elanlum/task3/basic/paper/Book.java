package ru.elanlum.task3.basic.paper;

import java.awt.*;

public abstract class Book extends PaperStuff {

    private Color coverColor;
    public Book(String producer, int price, PaperFormat paperFormat,
                int sheetsNumber, Color sheetsColor, Color coverColor) {
        super(producer, price, paperFormat, sheetsNumber, sheetsColor);
        this.coverColor = coverColor;
    }
}
