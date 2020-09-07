package com.datastructures.ArrayProblems;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=3;
        a[1]=2;
        a[2]=4;
        int key=6;
        TwoSumProblem sumProblem=new TwoSumProblem();
        System.out.println(Arrays.toString(sumProblem.twoSum(a,key)));

    }

    public int[] twoSum(int[] nums, int target) {
        int[] finalPlaces=new int[2];
        boolean flag=false;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    flag = true;
                    finalPlaces[0] = i;
                    finalPlaces[1] = j;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return finalPlaces;
    }
}
