package com.tw.pathashala;

public class Centimeter {

    private final double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(that.magnitude, magnitude) == 0;
    }
}
