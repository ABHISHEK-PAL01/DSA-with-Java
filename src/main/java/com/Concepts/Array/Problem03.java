//Search For an Element in an Array{Linear Search}
package com.Concepts.Array;

import java.util.Scanner;

//How I Do This:
//Given: array
//We take input from user "Enter search element"
//Import Scanner class
//store that element in a variable(search)
//traverse whole  array Using loop
//Check condition:
//At every every elemet
//if(arr[i]==search).if true then print that element and index
//else .False then print Element not found in array
public class Problem03 {
    static void search(int [] arr) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.println("Enter the Search element: ");
        int search = sc.nextInt();
        int found = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                found = arr[i];
                System.out.println("Element is found: " + arr[i] + "\nAt index" + i);
            }
        }
        if (found != search) {
            System.out.println("Element does not exist in Array");
        }
    }
    public static void main(String[] args){
        int [] array = {6,3,4,4,5,6,8};
        search(array);
    }
}
