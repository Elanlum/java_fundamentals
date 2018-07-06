package ru.elanlum.task3.basic.paper;

import ru.elanlum.task3.basic.AbstractStationery;

import java.awt.*;

public abstract class PaperStuff extends AbstractStationery {
    private PaperFormat paperFormat;
    private int sheetsNumber;
    private Color sheetsColor;

    public PaperStuff(String producer, int price, PaperFormat paperFormat, int sheetsNumber, Color sheetsColor) {
        super(producer, price);
        this.paperFormat = paperFormat;
        this.sheetsNumber = sheetsNumber;
        this.sheetsColor = sheetsColor;
    }
}
