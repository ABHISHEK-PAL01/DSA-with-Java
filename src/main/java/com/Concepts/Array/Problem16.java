package com.Concepts.Array;


import java.util.HashMap;

public class Problem16 {
    static void uniqueElement(int[] arr){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num:arr){
            h.put(num,h.getOrDefault(num,0)+1);}
        int minkey=-1;
        int minkeyfreq=Integer.MAX_VALUE;
        for(int key:h.keySet()){
            int currentkey=key;
            int currentkeyfreq=h.get(key);
            if(currentkeyfreq<minkeyfreq){
                minkey=currentkey;
                minkeyfreq=currentkeyfreq;
            }
        }
        System.out.println("Unique element is: "+minkey);
    }
    //********* We can also solve this using xor operator **************************************************
    static int aloneElement(int[] arr){
        int xornum =0;
        for(int n:arr){
            xornum = xornum^n;
        }
        return xornum;
    }
    public static void main(String[] args){
        int[] array={2,3,5,4,5,10,3,4,2};
        uniqueElement(array);
        System.out.println(aloneElement(array));
    }
}
