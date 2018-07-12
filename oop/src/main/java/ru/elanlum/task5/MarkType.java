package ru.elanlum.task5;

public enum MarkType {
    INTEGER {
        public Object getMark(String mark) {
            int number = Integer.parseInt(mark);
            if (number <= 0 || number > 5) {
                throw new IllegalArgumentException();
            }
            return number;
        }
    }, FLOAT {
        public Object getMark(String mark) {
            float number = Float.parseFloat(mark);
            if (number <= 0 || number > 5) {
                throw new IllegalArgumentException();
            }
            return number;
        }
    };
    public abstract Object getMark(String mark);
}
