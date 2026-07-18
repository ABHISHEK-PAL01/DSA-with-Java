//find average of array elements.
package com.Concepts.Array;


    //Given Array of Elements
//How To Do This:
//We iterate loop on array elements,
//At every iteration of elements ,elements are added in a sum variable in this sum variable we get sum of every element
//After getting sum of all elements ,then we find number of elements in array after than we put in formula of average.
// Average = Sum of all elements/Total no. of elements
 public class Problem01{
        float arr[] = {9,9,3,5,6,7,5,5,6,4};
        float n = arr.length;
        float sum=0;

    public void average(){
                for (int i = 0; i < n; i++) {
                    sum = sum + arr[i];

                }
                System.out.println("Average of array is: " +sum / n);
            }
public static void main(String[] args) {

    Problem01 obj = new Problem01();
    obj.average();
}


        }

//Time Complexity: O(n)



