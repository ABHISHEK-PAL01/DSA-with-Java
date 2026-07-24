//shift array element by k position.
package com.Concepts.Array;
//How I solve it.
//input user how much position shift
//take while loop traverse from last upto pos=n-2
//At every iteration store them in array list.
//then take another seperate for loop i=n-1-p;i<0;i--
//arr[i+=p]=arr[i]

//Time Complexity: O(n)


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem17 {

    static void kposition(int[] arr){
        Scanner sc =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the position of shifting: ");
        int pos = sc.nextInt();
        int n=arr.length;
        for(int i=n-1;i>=n-pos;i--){

            list.add(arr[i]);

        }
        for(int j=n-1-pos;j>=0;j--){
            arr[j+pos]=arr[j];
        }

        for(int i=pos-1;i>=0;i--){
            arr[i]=list.get(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7,8,9};
        kposition(array);
    }
}
