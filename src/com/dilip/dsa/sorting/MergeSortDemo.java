package com.dilip.dsa.sorting;

import java.sql.Array;
import java.util.Arrays;

public class MergeSortDemo {

    public static void mergeSort(int[] array, int left, int right){

        if(left<right){
            int mid = left+(right-left)/2;

            mergeSort(array, left,mid);
            mergeSort(array, mid+1 ,right);

            mergeHalves(array, left, mid, right);
        }
    }
    public static void mergeHalves(int[] array, int leftIndex, int mid, int right ){
        int leftSubArraySize = mid -leftIndex+1;
        int rightSubArraySize = right - mid;

        //Temporary arrays for left and right sub arrays
        int[] leftArray = new int[leftSubArraySize];
        int[] rightArray = new int[rightSubArraySize];

        //Copy data in sub arrays
        for(int i=0; i<leftSubArraySize;i++){
            leftArray[i] = array[leftIndex+i];
        }
        for(int i=0; i<rightSubArraySize;i++){
            rightArray[i] = array[mid+1+i];
        }

        //merge arrays

        int leftPointer =0, rightPointer =0;
        int mergedPointer = leftIndex;

        while(leftPointer < leftSubArraySize && rightPointer< rightSubArraySize){
            if(leftArray[leftPointer]<= rightArray[rightPointer]){
                array[mergedPointer] = leftArray[leftPointer];
                leftPointer++;
            }else{
                array[mergedPointer] = rightArray[rightPointer];
                rightPointer++;
            }
            mergedPointer++;
        }
        //COpy remaining items of left sub array
        while (leftPointer<leftSubArraySize){
            array[mergedPointer] = leftArray[leftPointer];
            leftPointer++;
            mergedPointer++;
        }
        // Copy remaining elements of rightSubArray, if any
        while (rightPointer < rightSubArraySize) {
            array[mergedPointer] = rightArray[rightPointer];
            rightPointer++;
            mergedPointer++;
        }
    }
    public static void main(String[] args) {

        int[] unsortedArray = {4,2,5,7,99};
        System.out.println(Arrays.toString(unsortedArray));
        mergeSort(unsortedArray,0, unsortedArray.length-1);

        System.out.println(Arrays.toString(unsortedArray));
    }
}
