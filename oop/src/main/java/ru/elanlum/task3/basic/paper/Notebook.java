package ru.elanlum.task3.basic.paper;

import java.awt.*;

public class Notebook extends Book {

    public Notebook(String producer, int price, PaperFormat paperFormat,
                    int sheetsNumber, Color sheetsColor, Color coverColor) {
        super(producer, price, paperFormat, sheetsNumber, sheetsColor, coverColor);
    }
}
