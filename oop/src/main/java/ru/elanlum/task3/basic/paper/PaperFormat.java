package ru.elanlum.task3.basic.paper;

public enum PaperFormat {
    A0(841, 1189),
    A1(594, 841),
    A2(420, 594),
    A3(297, 420),
    A4(210, 297),
    A5(148, 210),
    A6(105, 148),
    A7(74, 105),
    A8(52, 74),
    A9(37, 52),
    A10(26, 37);

    private int widthMillimeters;
    private int heightMillimeters;

    PaperFormat(int widthInMillimeters, int heightInMillimeters) {
        this.widthMillimeters = widthInMillimeters;
        this.heightMillimeters = heightInMillimeters;
    }

    public int getWidthMillimeters() {
        return widthMillimeters;
    }

    public int getHeightMillimeters() {
        return heightMillimeters;
    }
}
