package com.tutorial;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
        
        int[] arrayAngka1 = {1,2,3,4,5};
        
        // merubah aray menjadi string
        System.out.println("\nmegubah array menjadi string");
        System.out.println(Arrays.toString(arrayAngka1));
        
        // mengkopi array
        System.out.println("\n\nMengkopi Array\n=============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka2);
        
        //dengan loop
        System.out.println("\ndengan loop");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        //dengan copyOf
        System.out.println("\ndengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka3);
        
        // dengan copyOfRange
        System.out.println("\ndengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka4);
        
        // fill array
        System.out.println("\n\nFill Array\n=============");
        int[] arrayAngka5 = new int[5];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 10);
        printArray(arrayAngka5);
        
        // komparasi array
        System.out.println("\n\nKomparasi Array\n=============");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};
        
        // membandingkan dua buah array cek boolean dengan arrays equal
        System.out.println("\nmembandingkan dua buah nilai array");
        if (Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama"); // jika true
        } else {
            System.err.println("array ini beda"); // jika false
        }
        
//         membandingkan yang lebih besar dengan compare
//         System.out.println(Arrays.deepHashCode(args));
        
//        System.out.println("\nmengecek index mana yg berbeda");
//        System.out.println(Arrays.mismatch);

        System.out.println("\nmenyaring aray");
        int[] arrayAngka8 = {2,4,1,6,5,4,3,4};
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        System.out.println("\nmencari index array");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka "+ angka + " ada di index " + posisi);
    
    }
    
    private static void printArray(int [] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }

}
