//Return sum of positive and negative numbers
package com.Concepts.Array;
//How I Do This:
//Given: Array
//I create two variable one for store positive number and other for store negative number
//I perform iteration at every element of array using loop.
//check condition at every element , that element is positive or not.
//To check condition I use if-elseif
//if element is positive ,then add that element in positive variable.
//elseif element is negative ,then add element in negative variable.

public class Problem05 {
    static float[] sum(int[] arr){
        int n=arr.length;
        float positive=0;
        float negative=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive=positive+arr[i];
            }
            else if(arr[i]<0){
                negative = negative+arr[i];
            }
        }
        float ans[]={positive,negative};
        return ans;
    }
    public static void main(String[] args){
        int [] value = {3,-2,4,-4,53,45,-22,-34};
       float ans[] = sum(value);
       System.out.println("Sum of positive number is: "+ans[0]);
        System.out.println("Sum of negative number is: "+ans[1]);

    }
}
