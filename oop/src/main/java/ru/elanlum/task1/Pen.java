package ru.elanlum.task1;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE, makeFinal = false)
class Pen {
    String producer;
    String colour;
    double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.price, price) != 0) return false;
        if (!producer.equals(pen.producer)) return false;
        return colour.equals(pen.colour);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer.hashCode();
        result = 31 * result + colour.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }

    public String write(String hello) {
        return hello;
    }

    public void check() throws NullPointerException{
        if (producer == null || colour == null || price == 0)
            throw new NullPointerException();

    }
}
