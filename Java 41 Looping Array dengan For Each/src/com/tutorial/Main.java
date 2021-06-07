package com.tutorial;

//import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
    
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        
        // looping sederhana
        System.out.println("looping sederhana");
        for(int i = 0; i < 10; i++){
            System.out.println("index ke " + 1 + " adalah " + arrayAngka[i]);
        }
        
        // loping dengan properti array
        // agar otomatis DENGAN ARRAY LENGTH
        System.out.println("looping dengan properti array");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke " + 1 + " adalah " + arrayAngka[i]);
        }
        
        // looping khusus untuk collection <-array
        for( int angka : arrayAngka){
            System.out.println("agka pada loping ini adalah " + angka);
        }
    }
        
}
