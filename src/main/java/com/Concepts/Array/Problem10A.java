//Reverse Array and give output in array.Using two pointer approach
package com.Concepts.Array;
/*
-In this approach no headache of even or odd size array
-take while loop write condition (i<=j).
-i is initialize with 0 and j is initialize with (size-1)
- swapping of first and last element of array
- i++
- j--
*/

public class Problem10A {
    static void reverse(int[] arr){
        int size = arr.length;
        int i=0;
        int j=size-1;
        while(i<=j){
            //swapping
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;

        }
        int k=0;
        while(k<size){
            System.out.print(arr[k]);
            k++;
        }

    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        reverse(array);

    }
}
