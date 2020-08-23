package com.datastructures.arrays;

import java.util.Arrays;

public class OrderStatisticArray {
    public static void main(String[] args) {
//        int arr[] = { 2, -6 ,3 , 5, 1};
        int[] arr = {2, 30, 15, 10, 8, 25, 80};

        int[] arr1 = {3, 2};
        int[] arr2 = {1, 4};

//        findMinTwoLargestElements(arr,arr.length);
//        findMinTwoLargestElementsEfficient(arr,arr.length);
//        findMeanMedian(arr,arr.length);
//        findMinProduct(arr,arr.length,4);
//        findSumContiguous(arr,arr.length,6);
//        maxSumCombinationTwoArray(arr1,arr2,arr1.length,arr2.length,2);
//        smallestSecondSmallest(arr,arr.length);
//        smallestMissingNumber(arr,arr.length,10);
//        largestSubarraySumProblem(arr, arr.length);
        //this needs to be developed later
        twoTimeBuySellShares(arr, arr.length);

    }

    private static void twoTimeBuySellShares(int[] arr, int length) {
        int profit[] = new int[length];
        int max_price = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (max_price < arr[i]) {
                max_price = arr[i];
            }
            profit[i] = Math.max(profit[i + 1], max_price - arr[i]);

        }
        int min_price = arr[0];
        for (int i = 1; i < length; i++) {
            // min_price is minimum price in price[0..i]
            if (arr[i] < min_price)
                min_price = arr[i];

            // Maximum profit is maximum of:
            // a) previous maximum, i.e., profit[i-1]
            // b) (Buy, Sell) at (min_price, price[i]) and add
            //    profit of other trans. stored in profit[i]
            profit[i] = Math.max(profit[i - 1], profit[i] +
                    (arr[i] - min_price));
        }
        System.out.println(profit[length - 1]);
    }

    private static void largestSubarraySumProblem(int[] arr, int length) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = length - 1; i > 0; i--) {
            if (max > min) {
                break;
            } else {
                sum += arr[i];
                max = sum;
                min = sum + arr[i - 1];
            }
        }
        System.out.println(sum);
    }

    private static void smallestMissingNumber(int[] arr, int length, int k) {

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < k; j++) {
                boolean flag = false;
                if (arr[i] == j) {

                } else {
                    flag = true;
                }
            }
        }
    }

    private static void smallestSecondSmallest(int[] arr, int length) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second) {
                second = arr[i];
            }

        }

        System.out.println("first smallest:" + first + " second smallest:" + second);
    }


    private static void findSumContiguous(int[] arr, int length, int k) {
        int sumLength = 0;
        for (int i = length; i > 0; i--) {
            sumLength += i;
        }

        int[] sum = new int[sumLength];
        int count = 0;
        for (int i = 0; i < length; i++) {
            sum[count++] = arr[i];
            int temp = arr[i];
            for (int j = i + 1; j < length; j++) {
                temp = temp + arr[j];
                sum[count++] = temp;
            }
        }
        System.out.println(Arrays.toString(sum));
        System.out.println(sum[k - 1]);
    }

    private static void findMinProduct(int[] arr, int length, int k) {
        Arrays.sort(arr);
        int minProduct = 1;
        for (int i = 0; i < k; i++) {
            minProduct *= arr[i];
        }
        System.out.println("Min Product:" + minProduct);
    }

    private static void findMeanMedian(int[] arr, int length) {
        int total = 0;
        for (int i = 0; i < length; i++) {
            total += arr[i];

        }
        double mean = (double) total / (double) length;
        System.out.println("Mean is :" + mean);

        Arrays.sort(arr);
        if (length % 2 == 0) {
            int first = length / 2;
            int second = first - 1;
            double median = ((double) arr[first] + (double) arr[second]) / 2;
            System.out.println("Median is :" + median);
        }

    }

    private static void findMinTwoLargestElementsEfficient(int[] arr, int length) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }

        }
        for (int i = 0; i < length; i++) {
            if (arr[i] < second) {
                System.out.print(" " + arr[i]);
            }
        }
    }

    private static void findMinTwoLargestElements(int[] arr, int length) {
        int s, e;

        for (int i = 0; i < length; i++) {
            int temp = arr[i];
            int count = 0;
            for (int j = 0; j < length; j++) {

                if (temp < arr[j]) {
                    count++;
                }

            }
            if (count >= 2) {
                System.out.println(" " + temp);
            }

        }
    }
}
