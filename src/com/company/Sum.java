package com.company;

public class Sum extends Operation {
    public Sum(double termen1, double termen2) {
        super(termen1, termen2);
    }

    @Override
    public double operation() {
        return this.termen1 + this.termen2;
    }

    @Override
    public String toString() {
        return this.termen1 +
                " + " +
                this.termen2 +
                " = " + this.operation();
    }
}
