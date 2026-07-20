//Identify Element with Highest and lowest frequency
package com.Concepts.Array;

import java.util.HashMap;

//How I Solve it.
/*
- I use HashMap here.
- apply for-each loop
- convert all elements in key value format.

 */
public class Problem13_Imp {
    static void highestLowestFrequency(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
           freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxkey=-1;
        int maxkeyfreq=Integer.MIN_VALUE;
        for(int key:freq.keySet()){
            int currentkey=key;
            int currentkeyfreq=freq.get(key);
            if(currentkeyfreq>maxkeyfreq){
                maxkey=currentkey;
                maxkeyfreq=currentkeyfreq;

            }
        }
        int minkey=-1;
        int minkeyfreq=Integer.MAX_VALUE;
        for(int key: freq.keySet()){
            int currentkey=key;
            int currentkeyfreq=freq.get(key);
            if(currentkeyfreq<minkeyfreq){
                minkey=currentkey;
                minkeyfreq=currentkeyfreq;


            }
        }
        System.out.println("Highest Frequency Element is: "+maxkey);
        System.out.println("Lowest Frequency Element is: "+minkey);

    }
    public static void main(String[] args){
        int[] array= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        highestLowestFrequency(array);
    }
}