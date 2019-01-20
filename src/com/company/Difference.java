package com.company;

public class Difference extends Operation {


    public Difference(double termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    public Difference(double termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    public Difference(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    public Difference(Operation termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " - ";
    }

    @Override
    public double operation() {
        return this.termen1 - this.termen2;

    }

}
