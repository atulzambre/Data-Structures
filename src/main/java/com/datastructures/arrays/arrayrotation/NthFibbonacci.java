package com.datastructures.arrays.arrayrotation;

public class NthFibbonacci {
    public static void main(String[] args) {
        System.out.println(getNthFib(6));
    }

    public static int getNthFib(int n) {
        int f = 0;
        int s = 1;
        int finalNumber = 0;
        if (n == 2) {
            finalNumber = 1;
        }
        for (int i = 2; i < n; i++) {

            finalNumber = f + s;
            f = s;
            s = finalNumber;
        }
        return finalNumber;
    }

}
