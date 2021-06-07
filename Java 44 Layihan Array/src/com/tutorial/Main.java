package com.tutorial;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int[] arrayAngka1 = {2,1,6,34,8,4,6,8,9,5,3,5};
        int[] arrayAngka2 = {20,1,6,34,8,41,6,89,5,21,5,5};
        
        
        // penjumlahan array
        int[] arrayHasil = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil, "jumlah");
        System.out.println("\n");
        
        
        // menggabungkan dua buah array
        // array baru dari hasil gabungan
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i = 0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }
        // menggabuung
        for (int i = 0; i < arrayAngka2.length; i++){
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "gabung");
        System.out.println("\n");
        
        // reverse array
        printArray(arrayAngka1,"array 1");
        reverse(arrayAngka1);
        printArray(arrayAngka1,"reversed 1");
        System.out.println("\n");
        
        printArray(arrayAngka2, "array 1");
        reverse2(arrayAngka2);
        printArray(arrayAngka2,"reversed 2");
    }
    
    
    
    
    private static void reverse(int [] dataArray){
        Arrays.sort(dataArray);
        // mengambil isi arrays
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++ ){
            // mengganti isi arrays
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    
    private static void reverse2(int [] dataArray){
        Arrays.sort(dataArray);
        int buffer;
        for (int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i]; 
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }
    
    private static int[] tambahArray(int[] arrayInt1, int[]arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        } return arrayHasil;
    }
    
    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }

}
