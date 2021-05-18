package com.tw.pathashala;

public enum Unit {
    CM(0.01), M(1), KM(1000);

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    private double conversionFactor;

    public double getConversionFactor() {
        return conversionFactor;
    }
}
