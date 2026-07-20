//Print Alternative Extreme Elements
package com.Concepts.Array;
//How I Solve it:
//First I check size of array. The size of array can be even or odd.
//Here I write code for even or odd size of array because user can pass any type of array so our code should be robust.
//Inside even code
//apply for loop initialize from zero and reach to half of array .
//then print from starting arr[i];
//then print from ending arr[n-1-i];

//Inside Odd code
//again apply loop initialize from zero and reach to (n-1)/2.Here n is odd number.
//then print from starting arr[i]
//then print from ending arr[n-1-i]

//Time Complexity of Code is: O(n)


public class Problem09 {
    static void alternateExtremeElements(int[] arr){
        int n=arr.length;
        if(n%2==0){
          for(int i=0;i<n/2;i++){
              System.out.print(arr[i]+",");
              System.out.println(arr[n-i-1]);
          }
        }
        else{
            for(int i=0;i<(n-1)/2;i++){
                System.out.print(arr[i]+",");
                System.out.println(arr[n-1-i]);
            }

        }
    }
    public static void main(String[] abhi){
        int[] array={1,2,3,4,5,6};
        alternateExtremeElements(array);

    }
}
