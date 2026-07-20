//Shift Array Elements by One Position in cyclic Manner
package com.Concepts.Array;
//How I solve it:
/*
- First thing I store last element of array in temp variable
-apply  loop travese array.Initialize from i=n-2 to i>=0,i--.{
-arr[i+1]=arr[i];
}
- arr[0]=temp;
*/
public class Problem11 {
    static void shiftOnepostition(int[] arr){
        int n=arr.length;
        int i=n-2;
        int temp=arr[n-1];

        while(i>=0){

            arr[i+1]=arr[i];
            i--;
        }
        arr[0]=temp;
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        shiftOnepostition(array);
    }
}
