package com.tutorial;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
        
        // mengenal array muti dimensi lebih dalam
        
        int[][] array2D = {
            {1,2,3},
            {4,5,6},
        };
        
        System.out.println(array2D); // menampilkan induk address
        System.out.println(array2D[0]); // menamppilkan addres komponen pertama
        System.out.println(array2D[1]); // menampilkan addres kmponen kedua
        System.out.println(Arrays.deepToString(array2D));
        System.out.print("\n");
        
        char[] arrayChar1 = {'a','b','c'};
        char[] arrayChar2 = {'d','e','f'};
        
        char[][] arrayChar2D = {
            arrayChar1,
            arrayChar2
        };
        
        System.out.println(arrayChar2D);
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));
        System.out.println(Arrays.toString(arrayChar2D));
        System.out.println(Arrays.deepToString(arrayChar2D));
    }

}
