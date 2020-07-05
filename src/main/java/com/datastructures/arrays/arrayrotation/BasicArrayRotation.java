package com.datastructures.arrays.arrayrotation;

import java.util.Arrays;

//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
public class BasicArrayRotation {
    public static void main(String[] args) {
        int maxA=10;
        int rotateArray[] = new int[maxA];
        for(int i=0;i<maxA;i++){
        rotateArray[i]=i;
        }
        ///not work for large data
      //  rotateArraySimple(rotateArray,rotateArray.length,maxA/2);

        //works great for array rotation.
//       int[] rotatedArray= rotateArrayReversal(rotateArray,rotateArray.length,0);

//        searchInRotatedArray(rotatedArray,578);
//            if(pairInSortedRotatedArray(rotateArray,rotateArray.length,772)){
//                System.out.println("Pair Found");
//        }
//            else{
//                System.out.println("No Pair Found");
//        }

//            int r=findRotationCount(rotateArray,rotateArray.length);
//            System.out.println("rotations count:"+r);

            leftRotateArray(rotateArray,rotateArray.length,4);
            rightRotateArray(rotateArray,rotateArray.length,4);
//        findMinSortedRotatedArray(rotatedArray,rotatedArray.length);
    }

    private static void rightRotateArray(int[] rotateArray, int length, int k) {
        int mod=length%k;
        for(int i=0;i<length;++i){
            System.out.print(rotateArray[length%(i+mod)]
                    + " ");

            System.out.println();
        }
    }

    private static void findMinSortedRotatedArray(int[] rotatedArray, int length) {
        int i;
        for(i=0;i<length-1;i++){
            if(rotatedArray[i]>rotatedArray[i+1]){
                break;
            }
        }
        System.out.println("minimum values is :"+rotatedArray[i]);
    }

    private static void leftRotateArray(int[] rotateArray, int n, int k) {
        int mod = k % n;

        // Prints the rotated array from
        // start position
        for(int i = 0; i < n; ++i)
            System.out.print(rotateArray[(i + mod) % n]
                    + " ");

        System.out.println();
    }

    private static int findRotationCount(int[] rotateArray, int length) {
        int i;
        for(i=0;i<length-1;i++){
            if(rotateArray[i]>rotateArray[i+1]){
                break;
            }
        }
        int r=length-1-i;
        return r;
    }

    private static boolean pairInSortedRotatedArray(int[] rotateArray, int length, int sum) {

        int i;
        for(i=0;i<length;i++){
            if(rotateArray[i]>rotateArray[i+1]){
                break;
            }
        }
        int l=(i+1)%length;
        int r=i;
        while(l!=r){
            if(rotateArray[l]+rotateArray[r]==sum){
                return true;

            }
            if(rotateArray[l]+rotateArray[r]<sum){
            l=(l+1)%length;
            }
            else{
        r=(length+r-1)%length;
            }
        }
        return false;
    }

//    private static void searchInRotatedArray(int[] rotatedArray, int s) {
//        int pivote=findPivote(rotatedArray,0,rotatedArray.length-1);
//    }

//    private static int findPivote(int[] rotatedArray, int start, int end) {
//        if(end<start){
//            return -1;
//        }
//        if(start==end){
//            return start;
//        }
//        int mid=(start+end)/2;
//
//    }

    private static int[] rotateArrayReversal(int[] rotateArray, int length, int d) {
        reverseArray(rotateArray,0,d-1);
        System.out.println(Arrays.toString(rotateArray));
        reverseArray(rotateArray,d,length-1);
        System.out.println(Arrays.toString(rotateArray));
        reverseArray(rotateArray,0,length-1);
        System.out.println(Arrays.toString(rotateArray));


        return rotateArray;
    }

    private static void reverseArray(int[] rotateArray, int start, int end) {
        while(start<end){
            int temp=rotateArray[start];
            rotateArray[start]=rotateArray[end];
            rotateArray[end]=temp;
            start++;
            end--;
        }
    }

    private static void rotateArraySimple(int[] rotateArray, int length, int d) {
        int tempArray[]=new int[d];
        for(int i=0;i<d;i++){
            tempArray[i]=rotateArray[i];
        }

        for(int i=0;i<d;i++){
               for(int j=0;j<length-1;j++){
                   rotateArray[j]=rotateArray[j+1];
               }

            }
        for(int i=0;i<tempArray.length;i++){
          rotateArray[length-d+i]=tempArray[i];
        }
        System.out.println(Arrays.toString(rotateArray));
        }
    }

