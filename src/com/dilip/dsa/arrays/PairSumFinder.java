package com.dilip.dsa.arrays;

import java.util.HashSet;

//Can you write a function to find the pair of elements in an array whose sum is equal to
// a given target value? Please provide an efficient solution.
public class PairSumFinder {


    public static void main(String[] args) {
        int [] inputArray = {2,4,5,9,6,1,20,44};
        int checkSum = 46;
        HashSet<Integer> tracked = new HashSet<Integer>();
        for(int i = 0; i< inputArray.length;i++){
            tracked.add(inputArray[i]);
            if(tracked.contains(checkSum-inputArray[i])){
                System.out.println("FOund the numbers are : "+inputArray[i] +" & "+ (checkSum-inputArray[i]));
            }
        }

    }
}
