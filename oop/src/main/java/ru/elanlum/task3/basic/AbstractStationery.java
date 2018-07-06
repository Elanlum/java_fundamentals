package ru.elanlum.task3.basic;

public abstract class AbstractStationery {
    private String producer;
    private int price;

    public AbstractStationery(String producer, int price) {
        this.price = price;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append('{');
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
