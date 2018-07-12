package ru.elanlum.task5;

public enum Subject {
    MATH (MarkType.INTEGER),
    JAVA_PROGRAMMING (MarkType.FLOAT),
    PHYSICS (MarkType.FLOAT),
    ECONOMIS (MarkType.INTEGER),
    WORLD_HISTORY (MarkType.INTEGER);

    private MarkType markType;
    Subject (MarkType markType) {
        this.markType = markType;
    }

    public MarkType getMarkType() {
        return markType;
    }
}
