package com.tutorial;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
        
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];
        
        // mengecek addres array
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        // mengganti lokasi array
        arrayAngka2 = arrayAngka1;
        
        // cek lokasi setelah diganti
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        System.out.println("Array 1 " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 " + Arrays.toString(arrayAngka2));
        
        // mencoba mengganti isi array
        // pasti hasilnya sama karena addresnya sudah sama
        arrayAngka1[0] = 100;
        arrayAngka2[4] = 50;
        
        System.out.println("Array 1 " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 " + Arrays.toString(arrayAngka2));
        
        ubahArray(arrayAngka1);
        System.out.println("Array 1 " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 " + Arrays.toString(arrayAngka2));
        
    
    }
    // membuat method/fungsi
    // method yang argumenya adalah reference (pass by reference)
    // bukan pass by value
    
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 130;
    }

}






























