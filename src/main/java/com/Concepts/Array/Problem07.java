//Swap alternate elements in Array
package com.Concepts.Array;
//How I Solve this:
//Iterate array using for loop;
//chek condition if(i!=i/2){
//done swapping .

public class Problem07 {
    static void alternateswap(int[] arr){

        int n = arr.length;
        int i=0;
        while( i<n-1){

           int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

            i=i+2;


        }
        for( i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int [] array={1,2,3,4,5};
        alternateswap(array);
    }
}
