package com.company;

public abstract class Operation {
    protected double termen1;
    protected double termen2;
    protected Operation termen1Op;
    protected Operation termen2Op;
    protected String operationSign;


    public Operation(double termen1, double termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2;
    }

    public Operation(double termen1, Operation termen2) {
        this.termen1 = termen1;
        this.termen2 = termen2.operation();
        this.termen2Op = termen2;
    }

    public Operation(Operation termen1, Operation termen2) {
        this.termen1 = termen1.operation();
        this.termen2 = termen2.operation();
        this.termen1Op = termen1;
        this.termen2Op = termen2;
    }

    public Operation(Operation termen1, double termen2) {
        this.termen1 = termen1.operation();
        this.termen2 = termen2;
        this.termen1Op = termen1;
    }

    public abstract double operation();

    @Override
    public String toString() {
        return computationTerms() + " = " + this.operation();
    }

    private String computationTerms() {
        String primulOperator;
        String alDoileaOperator;
        if (termen1Op == null) {
            primulOperator = termen1 + "";
        } else {
            primulOperator = termen1Op.computationTerms();
        }

        if (termen2Op == null) {
            alDoileaOperator = termen2 + "";
        } else {
            alDoileaOperator = termen2Op.computationTerms();
        }
        return "( " + primulOperator +
                operationSign +
                alDoileaOperator + " )";
    }

    //sum4.equals(sum5)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Operation &&
                this.operation() == ((Operation) obj).operation()) {
            return true;
        }
        return false;
    }
}
