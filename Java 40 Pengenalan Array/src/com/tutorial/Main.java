package com.tutorial;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){

        // assignment
        // tipedata [] nama = {komponen,komponen}
        
        System.out.println("Assignment Arrays");
        int[] arrayInteger = {1,2,3,4,5};
        
        // menggantiisi array
        arrayInteger[1] = 11;
        
        // menampilkan array
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        System.out.println(arrayInteger[4]);
        
        // menampilkan arra sekaligus
        // dengan batua helper to string
        
        System.out.println(Arrays.toString(arrayInteger));
        
        
        // deklarasi
        // tipedata[] nama = new [jumlah arrays]
        
        System.out.println("Deklarasi Arrays");
        float[] arrayFloat = new float[5];
        
        arrayFloat[1] = 12.5f;
        
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        
        System.out.println(Arrays.toString(arrayFloat));
        
        
    }

}
