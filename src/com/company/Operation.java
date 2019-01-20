package com.company;

public abstract class Operation {
    protected double termen1;
    protected double termen2;

    public Operation(double termen1, double termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2;
    }

    public abstract double operation () ;
}
