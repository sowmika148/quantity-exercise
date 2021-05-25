package com.tw.pathashala;

public enum Unit {
    CM(0.01), M(1), KM(1000);

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    private final double conversionFactor;

    public double convertTo(double magnitude, Unit targetUnit) {
        return magnitude * (conversionFactor / targetUnit.conversionFactor);
    }
}
