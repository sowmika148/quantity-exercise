package com.tw.pathashala;

import java.util.Objects;

public class Length {
    private final double magnitude;
    private final Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Length add(Length length) {
        double sum = this.magnitude + length.convertTo(this.unit);
        return new Length(sum, this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(that.convertTo(unit), convertTo(unit)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertTo(unit));
    }

    private double convertTo(Unit toUnit) {
        return this.unit.convertTo(this.magnitude, toUnit);
    }
}
