//Print Array Intersection Elements
//How I solve this:
//Here two scienerio can be possible one for common size of array and other is different size array
//I case of different size arrays. Always give value of larger size array.
//Here I take nested loop i,j:i is outer , j is inner loop.
//check condition arr1[i]==arr2[j]
//store common elements in different array.
//Finally print that array who hold common element

package com.Concepts.Array;

public class Problem08 {
    static void intersectionArray(int arr1[],int arr2[]){
        int n = arr2.length;
       int i=0;
       for(int j=0;j<n;j++){
           for(i=0;i<n;i++){
               if(arr1[j]==arr2[i]){
                   System.out.println(arr2[j]);
               }
           }
       }

    }
    public static void main(String[] args){
        int[] array1={5,3,7,4,9};
        int[] array2={6,3,2,4,1};

        intersectionArray(array1,array2);
    }
}
//Time Complexity:O(n2); Very Disappointing
