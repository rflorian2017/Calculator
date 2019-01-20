package com.company;

public class Divide extends Operation {
    public Divide(double termen1, double termen2) {
        super(termen1, termen2);
    }

    @Override
    public double operation() {
        return this.termen1 / this.termen2;
    }
}
