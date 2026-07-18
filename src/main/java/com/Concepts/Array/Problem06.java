//Find first unsorted element in array.Array can be in Ascending or desending order.
package com.Concepts.Array;
//How I Do This:
//Given: Array
//First, we have to find given array is arranged in ascending or descending order.
//How to find this .By just checking first and last element of array.if first element is smaller than last ,so array
//arrange in ascending order.if first element is bigger than last ,so array is arranged in descending order
//Once you know this things become very easy.

public class Problem06 {
    static int first(int[] arr){
        int n = arr.length;
        int found=0;
        if(arr[0]<arr[n-1]){
            for(int i =0;i<n-1;i++){
                if(arr[i]>=arr[i+1]){
                    found=arr[i+1];

                }

            }
        }
        else if(arr[0]>arr[1]){
            for(int i=0;i<n-1;i++){
                if(arr[i]<=arr[i+1]){
                    found=arr[i+1];
                }
            }
        }
        else{
            System.out.println("Unable to find first element because whole array is unsorted");
        }
        return found;
    }
    public static void main(String[] args){
        int[] array = {9,8,7,6,5,10,4,3,2,1};
        System.out.println("Unsorted element is: "+first(array));
    }
}
