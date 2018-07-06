package ru.elanlum.task3.basic.paper;

import java.awt.*;

public class Datebook extends Book {

    public Datebook(String producer, int price, PaperFormat paperFormat,
                    int sheetsNumber, Color sheetsColor, Color coverColor) {
        super(producer, price, paperFormat, sheetsNumber, sheetsColor, coverColor);
    }
}
