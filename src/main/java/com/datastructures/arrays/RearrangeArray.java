package com.datastructures.arrays;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_en;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RearrangeArray {
    public static void main(String[] args) {

        int maxA=1000;
//        int rearrangeArray[]={50, 40, 70, 60, 90,56,43,25,60};
//        int indexArray[]=    {3,  0,  4,  1,  2,5,7,8,6};

        int rearrangeArray[]={ 2,1, 3, 2, 4, 7,6, 9, 10 };

        int mat[][]={ {10, 20, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 48},
                {32, 33, 39, 50},
        };

//        for(int i=0;i<maxA;i++){
//            rearrangeArray[i]=i;
//        }
//        rearrangeArraySimple(rearrangeArray,rearrangeArray.length);
//        reverseArray(rearrangeArray,rearrangeArray.length,0,rearrangeArray.length-1);
//        rearrangePositiveNegative(rearrangeArray,rearrangeArray.length);
//        moveAllZeroToEnd(rearrangeArray,rearrangeArray.length);
//        posEvenGreaterThenOdd(rearrangeArray,rearrangeArray.length);
//        smallestLargest2ndSmallest2ndLargest(rearrangeArray,rearrangeArray.length);
//        doubleTheFirstElementAndMoveZeroToEnd(rearrangeArray,rearrangeArray.length);
//        reorderAnArrayAccordingToGivenIndex(rearrangeArray,rearrangeArray.length,indexArray);
//        reorderAnArrayAccordingToGivenIndexWithoutAuxilaryComplexity(rearrangeArray,rearrangeArray.length,indexArray);


//        formBiggestNumber(rearrangeArray,rearrangeArray.length);
//        replaceIndexWithValue(rearrangeArray,rearrangeArray.length);

        //fisher-yates algorithm
//        randomArray(rearrangeArray,rearrangeArray.length);
//        rearrangeArrayAllEvenFirstAllOddLast(rearrangeArray,rearrangeArray.length);
//        kThSmallestInMatrix(mat,mat.length,3);
        findThreeLargestInArray(rearrangeArray,rearrangeArray.length);


    }

    private static void findThreeLargestInArray(int[] rearrangeArray, int length) {
        int i,first,second,third;
        first=third=second=Integer.MIN_VALUE;
        for(i=0;i<length;i++){
            if(rearrangeArray[i]>first){
                third=second;
                second=first;
                first=rearrangeArray[i];
            }
            else if(rearrangeArray[i]>second){
                third=second;
                second=rearrangeArray[i];
            }
            else{
                third=rearrangeArray[i];
            }
        }
        System.out.println("largest three elements: "+first+","+second+","+third);
    }

    private static void kThSmallestInMatrix(int[][] mat, int length, int k) {
        int mergedList[]=new int[length*length];
        int count=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                mergedList[count++]=mat[i][j];
            }

        }
        Arrays.sort(mergedList);
        System.out.println("kth Smallest elements is:" +mergedList[k]);
    }

    private static void rearrangeArrayAllEvenFirstAllOddLast(int[] rearrangeArray, int length) {

        int i=-1,j=0;
        while(j!=length){
            if(rearrangeArray[j]%2==0){
               i++;
               int temp=rearrangeArray[j];
               rearrangeArray[j]=rearrangeArray[i];
               rearrangeArray[i]=temp;
            }
            j++;
        }
        System.out.println(Arrays.toString(rearrangeArray));

    }

    private static void randomArray(int[] rearrangeArray, int length) {
        Random random=new Random();
        for(int i=length-1;i>0;i--){
            int ran=random.nextInt(i+1);
            int temp=rearrangeArray[ran];
            rearrangeArray[ran]=rearrangeArray[i];
            rearrangeArray[i]=temp;
        }
        System.out.println(Arrays.toString(rearrangeArray));
    }

    private static void replaceIndexWithValue(int[] rearrangeArray, int length) {
       int sml[]=new int[length];
       for(int i=0;i<length;i++){
           int temp=rearrangeArray[i];
           sml[temp]=i;
       }
        System.out.println(Arrays.toString(sml));
    }

    //need to work on this problem
    private static void formBiggestNumber(int[] rearrangeArray, int length) {
        Arrays.sort(rearrangeArray);

    }

    private static void reorderAnArrayAccordingToGivenIndexWithoutAuxilaryComplexity(int[] rearrangeArray, int length, int[] indexArray) {
        for(int i=0;i<length;i++){
            int indexValue=indexArray[i];
//            int arrayValue=rearrangeArray[i];

            int temp=rearrangeArray[indexValue];
            rearrangeArray[indexValue]=rearrangeArray[i];
            rearrangeArray[i]=temp;
            int indexCheck=indexArray[indexValue];
            indexArray[indexValue]=indexArray[i];
            indexArray[i]=indexCheck;
        }
        System.out.println(Arrays.toString(rearrangeArray));

    }

    private static void reorderAnArrayAccordingToGivenIndex(int[] rearrangeArray, int length, int[] indexArray) {
        int sml[]=new int[length];
        for(int i=0;i<length;i++){
            int checkIndex=indexArray[i];
            sml[checkIndex]=rearrangeArray[i];
        }

        System.out.println(Arrays.toString(sml));

    }

    private static void doubleTheFirstElementAndMoveZeroToEnd(int[] rearrangeArray, int length) {
        for(int i=0;i<length-1;i++){
            if(rearrangeArray[i]==rearrangeArray[i+1]){
                rearrangeArray[i]=rearrangeArray[i]*2;
                rearrangeArray[i+1]=0;
                i++;
            }
        }
        //move zeros to end
        int count=0;
        for(int i=0;i<length;i++){
            if(rearrangeArray[i]!=0){
                rearrangeArray[count++]=rearrangeArray[i];
            }
        }
        while(count<length){
            rearrangeArray[count++]=0;
        }
        System.out.println(Arrays.toString(rearrangeArray));


    }

    private static void smallestLargest2ndSmallest2ndLargest(int[] rearrangeArray, int length) {
        Arrays.sort(rearrangeArray);
        int sml[]=new int[length];
        int q=length-1,p=0;
        for(int i=0;i<length;i++){
            if((i+1)%2==0){
                sml[i]=rearrangeArray[q--];
            }
            else{
                sml[i]=rearrangeArray[p++];
            }
        }
        System.out.println(Arrays.toString(sml));
    }

    private static void posEvenGreaterThenOdd(int[] rearrangeArray, int length) {
        //Sort
        Arrays.sort(rearrangeArray);
        System.out.println(Arrays.toString(rearrangeArray));
        int sml[]=new int[length];
        int q=length-1,p=0;
        for(int i=0;i<length;i++){
            if((i+1)%2==0){
                sml[i]=rearrangeArray[q--];
            }
            else{
                sml[i]=rearrangeArray[p++];
            }

        }

        System.out.println(Arrays.toString(sml));


    }

    private static void moveAllZeroToEnd(int[] rearrangeArray, int length) {
        //quicksort
        int start=0,end=length-1;
        while(start<end){
            if(rearrangeArray[start]==0&&rearrangeArray[end]==0){
                end--;
            }
            else if(rearrangeArray[start]==0){
                int temp=rearrangeArray[start];
                rearrangeArray[start]=rearrangeArray[end];
                rearrangeArray[end]=temp;
                start++;
                end--;
            }
            else{
                start++;
            }
        }
        System.out.println(Arrays.toString(rearrangeArray));
    }

    private static void rearrangePositiveNegative(int[] rearrangeArray, int length) {

        //quick sort to separate positive and negative numbers in array

        int i=-1,temp=0;
      for(int j=0;j<length;j++){
          if(rearrangeArray[j]<0){
              i++;
              temp=rearrangeArray[i];
              rearrangeArray[i]=rearrangeArray[j];
              rearrangeArray[j]=temp;
          }




      }
        int pos=i+1,neg=0;
        while(pos<length&&neg<pos&&rearrangeArray[neg]<0){
            temp=rearrangeArray[neg];
            rearrangeArray[neg]=rearrangeArray[pos];
            rearrangeArray[pos]=temp;
            neg+=2;
            pos++;
        }
        System.out.println(Arrays.toString(rearrangeArray));
    }

    private static void reverseArray(int[] rearrangeArray, int length, int start, int end) {
        while(start<end){
            int temp=rearrangeArray[start];
            rearrangeArray[start]=rearrangeArray[end];
            rearrangeArray[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(rearrangeArray));
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
