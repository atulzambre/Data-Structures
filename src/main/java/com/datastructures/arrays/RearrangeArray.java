package com.datastructures.arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {

        int maxA=10;
        int rearrangeArray[]={19, 7, 0, -1, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, -1, 17, 4};
//        for(int i=0;i<maxA;i++){
//            rearrangeArray[i]=i;
//        }
        rearrangeArraySimple(rearrangeArray,rearrangeArray.length);
    }

    private static void rearrangeArraySimple(int[] rearrangeArray, int length) {
        int temp[]=new int[length];
        for(int i=0;i<length;i++){
            int k=searchInt(rearrangeArray,length,i);
            temp[i]=k;
        }
        rearrangeArray=temp;
        System.out.println(Arrays.toString(rearrangeArray));
    }

    private static int searchInt(int[] rearrangeArray, int length, int i) {
        int check=-1;
        for(int j=0;j<length;j++){
            if(i==rearrangeArray[j]){
                check= i;
            }
        }
        return check;
    }
}
