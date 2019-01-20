package com.company;

public class Difference extends Operation {
    public Difference(double termen1, double termen2) {
        super(termen1, termen2);
    }

    @Override
    public double operation() {
        return this.termen1 - this.termen2;
    }
}
