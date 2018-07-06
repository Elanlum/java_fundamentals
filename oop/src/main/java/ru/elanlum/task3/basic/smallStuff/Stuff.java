package ru.elanlum.task3.basic.smallStuff;

import ru.elanlum.task3.basic.AbstractStationery;

public abstract class Stuff extends AbstractStationery {

    private int packageAmount;

    public Stuff(String producer, int price, int packageAmount) {
        super(producer, price);
        this.packageAmount = packageAmount;
    }
}
