package com.datastructures.arrays;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr;
        arr=new int[5];

        arr[0]=10;
        arr[1]=5;
        arr[2]=6;
        arr[3]=12;
        arr[4]=45;

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
