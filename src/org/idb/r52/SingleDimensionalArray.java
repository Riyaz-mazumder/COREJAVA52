package org.idb.r52;

import java.util.Arrays;

public class SingleDimensionalArray {
    
    static int rolls[];
    
    public static void main(String[] args) {
        System.out.println(rolls);
        rolls = new int[5];
        rolls[2] = 12;
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = i;
            System.out.println(rolls[i]);
        }
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        int[] arr2;
        arr2 = new int[2];
        System.out.println(arr2);
        
        int[] arrL = {11, 222, 53, 46};
       for (int i = 0; i < arrL.length; i++) {
            System.out.println(arrL[i]);
        }
       
       
       
        int ar[] = {10, 5, 46, 2, 1, 5, 8, 1, 9, 7};
        Arrays.sort(ar);
        System.out.println(".................................");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        
        
    }
}