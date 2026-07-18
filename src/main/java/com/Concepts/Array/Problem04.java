//Find largest element of array;
package com.Concepts.Array;
//HOw I Do This
//Given: array
//Here we use loop i
//i is doinig comparison
//In array, we start comparing from 0 index,and compare to its next element,0 element is largest or  not to that element.
//if true, we shifting  elements value then iteration change
//if false, we don't change anything,Just i move to next iteration
//And the end we see largest element placed at the last of array at every condition.
//the last elment of array is an largest element

public class Problem04 {
    static int largest(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            //for (int j = 0; j < n - 1; j++) {
                if (arr[i] > arr[i + 1]) {
                     temp = arr[i];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
           // }
        }
        //int element = arr[n-1];

        return arr[n-1];
    }
    public static void main(String[] args){
        int [] rollno={10,39,3,43,2,22,21};
       System.out.println("Largest number of Array is: "+largest(rollno));
    }

}
