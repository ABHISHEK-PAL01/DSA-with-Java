//Find mode of Array.
package com.Concepts.Array;
//How I solve it.
/*-Convert whole array in sorted order.then check next element of every element.
 - if that element and next element both are equal store it int different variable */

import java.util.HashMap;

public class Problem12_Imp {
    static int highestFrequency(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int maxkey=-1;
        int maxkeyfrequency=-1;
        for(int key:freq.keySet()){
            int currentkey=key;
            int currentkeyfrequency=freq.get(key);
            if(currentkeyfrequency>maxkeyfrequency){
                maxkey=currentkey;
                maxkeyfrequency=currentkeyfrequency;
            }
        }
        return maxkey;
    }
    public static void main(String[] args){
        int[] array={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
       System.out.println(highestFrequency(array));
    }
}
