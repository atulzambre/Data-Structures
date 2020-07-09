package com.datastructures.arrays;

import java.util.Arrays;

public class OrderStatisticArray {
    public static void main(String[] args) {
//        int arr[] = { 2, -6 ,3 , 5, 1};
        int arr[]= { 10, -10, 20, -40 };

//        findMinTwoLargestElements(arr,arr.length);
//        findMinTwoLargestElementsEfficient(arr,arr.length);
//        findMeanMedian(arr,arr.length);
//        findMinProduct(arr,arr.length,4);
        findSumContiguous(arr,arr.length,6);
    }

    private static void findSumContiguous(int[] arr, int length, int k) {
        int sumLength=0;
        for(int i=length;i>0;i--){
            sumLength+=i;
        }

        int sum[] =new int[sumLength];
        int count=0;
        for(int i=0;i<length;i++){
            sum[count++]=arr[i];
            int temp=0;
            for(int j=i+1;j<length;j++){
                sum[count++]=arr[i]+arr[j];
            }
        }
        System.out.println(Arrays.toString(sum));
        System.out.println(sum[k]);
    }

    private static void findMinProduct(int[] arr, int length, int k) {
        Arrays.sort(arr);
        int minProduct=1;
        for(int i=0;i<k;i++){
            minProduct*=arr[i];
        }
        System.out.println("Min Product:"+minProduct);
    }

    private static void findMeanMedian(int[] arr, int length) {
        int total = 0;
        for (int i=0;i<length;i++){
            total+=arr[i];

        }
        double mean=(double)total/(double)length;
        System.out.println("Mean is :"+mean);

        Arrays.sort(arr);
        if (length%2==0){
            int first=length/2;
            int second=first-1;
            double median=((double)arr[first]+(double)arr[second])/2;
            System.out.println("Median is :"+median);
        }

    }

    private static void findMinTwoLargestElementsEfficient(int[] arr, int length) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                second=arr[i];
            }

        }
        for (int i=0;i<length;i++){
            if (arr[i]<second){
                System.out.print(" "+arr[i]);
            }
        }
    }

    private static void findMinTwoLargestElements(int[] arr, int length) {
        int s,e;

        for (int i=0;i<length;i++){
            int temp=arr[i];
            int count=0;
            for(int j=0;j<length;j++){

                if(temp<arr[j]){
                    count++;
                }

            }
            if(count>=2){
                System.out.println(" "+temp);
            }

        }
    }
}
