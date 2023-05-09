package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("This animal is mostly ").append(color)
                .append(". It has ").append(numberOfPaws);
        if (numberOfPaws > 1) {
            sb.append(" paws and ");
        } else {
            sb.append(" paw and ");
        }
        if (hasFur) {
            sb.append("a");
        } else {
            sb.append("no");
        }
        sb.append(" fur.");
        return sb.toString();
    }
}
