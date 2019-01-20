package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sum sum = new Sum(4.2, 5);
        System.out.println(sum.operation());
        System.out.println(sum);

        Multiply mult = new Multiply(3.2, 14);
        System.out.println(mult);

        Divide div = new Divide(2, 1);
        System.out.println(div);

        Difference dif = new Difference(3, 20);
        System.out.println(dif);

        Sum sum2 = new Sum(dif, div);
        Difference difference1 = new Difference(sum2, dif);
        System.out.println(difference1);
        //Sum sum3 = new Sum(dif, div);

        // Operation , Sum, Diff, Div, Multiply
        System.out.println(sum2); // 1 + (3-20) = -16
        System.out.println(sum2.operation());

        System.out.println(new Pow(2,3));

        Sum sum4 = new Sum(4, 7);
        Sum sum5 = new Sum(1,10);
        Difference difference4 = new Difference(12,1);

        System.out.println(sum4.equals(sum5));
        Object object = new Object();
        System.out.println(sum.equals(object));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an operation");
        String text = scanner.next();

        // sum, 2,3
        String[] array = text.split(",");
        if(array[0].equals("sum") ) {
            System.out.println(new Sum(Double.parseDouble(array[1]),
                    Double.parseDouble(array[2])));
        }
        System.out.println();



        //sum.operation(); // va intoarce suma 4 + 5
    }
}
