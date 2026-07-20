//Reverse an Array.Give Output in Array
package com.Concepts.Array;
//How I solve it.
//To solve this question I use previous approch of alternative extreme elements but this question a bit different
//from previous question
//Check Condition the input array is even or odd
//if input array is even.
//apply loop initialize from zero to half of array.
//perform swapping at every iteration betweeen first and last element of array.
//At the end whole array is reversed

// if input array is odd
//apply loop initialize from zero to (n-1)/2 of array.Here n is size of array
//perform swapping at every iteration between first and last element of array.
//Use see at every odd case their is a middle element which remains at their place.
//At the end whole array is reversed

//Time Complexity is:O(n)

// ***************** or ************************
//I also solved this question using two pointer approach.In Problem number 10A which more efficient code.

public class Problem10 {
    static void reverse(int[] arr){
        int n=arr.length;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;
            }
        }
        else{
            for(int i=0;i<(n-1)/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;

            }
        }
      for(int i=0;i<n;i++){
          System.out.print(arr[i]);
      }

    }
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7,8,9,10};
        reverse(array);
    }




}
