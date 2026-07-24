//Sort 0s,1s and 2s

package com.Concepts.Array;
//How I solve it.

public class Problem19 {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
            for(i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] array={1,0,2,1,2};
        sort(array);
    }
}
