package ru.elanlum.task3.basic.paper;

import java.awt.*;

public class OfficeEquipmentPaper extends PaperStuff {

    private int densityGramPerSquareMeter;

    public OfficeEquipmentPaper(String producer, int price, PaperFormat paperFormat,
                                int sheetsNumber, Color sheetsColor, int densityGramPerSquareMeter) {
        super(producer, price, paperFormat, sheetsNumber, sheetsColor);
        this.densityGramPerSquareMeter = densityGramPerSquareMeter;
    }
}
