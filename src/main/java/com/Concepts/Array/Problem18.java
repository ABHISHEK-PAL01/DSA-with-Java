//Print union of array elements
package com.Concepts.Array;
//How I solve it.
//Here I use collection framework
//I use Set interface
//Use HashSet concrete class
import java.util.HashSet;
import java.util.Set;

public class Problem18 {
    static void union(int[] arr1,int[] arr2){
        Set<Integer> set = new HashSet<>();
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
    public static void main(String[] args){
        int[] array1={1,2,2,3,4,3,5,6,1,7};
        int[] array2={6,3,9,4,4,4,4,5,8,6};
        union(array1,array2);
    }
}
