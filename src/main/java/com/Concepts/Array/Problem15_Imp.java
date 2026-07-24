//Find Missing number from array.
package com.Concepts.Array;

public class Problem15_Imp {
    static void missingNumber(int[] arr){
       int n=arr.length;
       int sum=0;
       int arraysum=0;
        for(int i=0;i<n;i++){
            sum=sum+i;
            arraysum=arraysum+arr[i];
        }
        int x=(sum+n)-arraysum;
        System.out.println("Missing Element is: "+x);

    }
    public static void main(String[] args){
        int[] array={3,6,4,0,15,2,13,14,5,18,12,11,16,17,1,7,8,9};
        missingNumber(array);
    }
}
