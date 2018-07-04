package ru.elanlum.task2;

public enum Stationery {
    PEN(20),
    PENCIL(10),
    ERASER(5),
    NOTEBOOK(6),
    SCISSORS(30),
    RULER(10),
    MARKER(29),
    STAPLER(30);

    private int priceRub;

    Stationery(int priceRub) {
        this.priceRub = priceRub;
    }

    public double getPriceRub() {
        return priceRub;
    }
}
