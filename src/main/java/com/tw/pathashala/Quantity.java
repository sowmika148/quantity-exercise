package com.tw.pathashala;

public class Quantity {

    private final double magnitude;
    private final Unit unit;

    public Quantity(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity that = (Quantity) o;
        return Double.compare(that.magnitude, magnitude) == 0;
    }
}
