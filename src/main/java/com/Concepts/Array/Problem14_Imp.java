//Sort an Array in O and 1.
package com.Concepts.Array;
//How I Solve it.
//apply loop on array iterate it less than n-1 position
//check condition
//if arr[i]>arr[i+1]
//swap

public class Problem14_Imp {
    static void sortArray(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j] =temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }

        }
        for( i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] array={0,1,1,0,1,0,0,0,1,1,0};
        sortArray(array);





    }
}
