package com.tutorial;

import  java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Belajar Array Multi dimensi");
        
        // membuat array multidimensi dengan assignment
        // int[][] namaArray = {{},{}};
        
        int[][] array2D = {
        //     kolom  
        //   1 2 3 4 5      baris
            {1,2,3,4,5}, // 1
            {6,7,8,9,10} // 2
        };
        printArray2D(array2D);
        
        System.out.print("\n");
        System.out.print("\n");
        // gunakan deepToString untuk melihat isi dalam array multidimensi
        // System.out.print(Arrays.deepToString(array2D));
        
        // membuat array multidimensi dengan deklarasi
        // int[][] namaArray = new int [baris][kolom]
        
        int[][] array2D2 = new int [5][4];
        printArray2D(array2D2);
       
        
        // loop dengan array multidimensi
//        for (int i = 0; i < array2D2.length; i++){
//            System.out.print(Arrays.toString(array2D2[i]));
//            System.out.print("\n");
//        }
        
        // loop dengan array manual lengkap
//        for (int i = 0; i < array2D2.length; i++){ // loop baris
//            for (int j = 0; j < array2D2[i].length; j++){ // loop kolom
//                System.out.print(array2D2[i][j] + ",");
//            } System.out.print("\n");
//        }
//        
        
        // loop array dengan foreach
//          for (int[] baris : dataArray){
//              for (int angka : baris){
//                  System.out.print(angka + ",");
//            } System.out.print("\n");
//        }
        
    }
    
    private static void printArray2D(int [][] dataArray){
        for (int[] baris : dataArray){
            for (int angka : baris){
                System.out.print(angka + " ");
            } System.out.print("\n");
        }
        
    }

}
