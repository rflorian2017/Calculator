package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sum sum = new Sum(4.2, 5);
        System.out.println(sum.operation());
        System.out.println(sum);
        //sum.operation(); // va intoarce suma 4 + 5
    }
}
