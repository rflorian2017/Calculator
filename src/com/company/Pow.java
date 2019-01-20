package com.company;

public class Pow extends Operation {
    public Pow(double termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " ^ ";
    }

    public Pow(double termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " ^ ";
    }

    public Pow(Operation termen1, Operation termen2) {
        super(termen1, termen2);
        operationSign = " ^ ";
    }

    public Pow(Operation termen1, double termen2) {
        super(termen1, termen2);
        operationSign = " ^ ";
    }

    @Override
    public double operation() {
        return Math.pow(this.termen1, this.termen2);
    }
}
