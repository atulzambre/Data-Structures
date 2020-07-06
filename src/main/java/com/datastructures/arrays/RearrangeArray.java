package com.datastructures.arrays;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_en;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {

        int maxA=1000;
        int rearrangeArray[]={50, 40, 70, 60, 90};
        int indexArray[]={3,  0,  4,  1,  2};

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
        reorderAnArrayAccordingToGivenIndex(rearrangeArray,rearrangeArray.length,indexArray);


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
