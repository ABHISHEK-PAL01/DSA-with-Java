//Multiply Every Element of Array with 10;
package com.Concepts.Array;
//How I do this:
//Use For Loop and traverse to every element
//At every i iteration I multiply with 10

import java.util.Arrays;

public class Problem02 {

    static int[] multi(int[] arr){
        int n=arr.length;
        int [] newarray= new int[n];
       for(int i=0;i<n;i++){
           int element = arr[i]*10;
           newarray[i]=element;
       }
       return newarray;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(multi(arr)));


    }
}
