package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Maukan panjang : ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Maukan lebar : ");
        int inputLebar = userInput.nextInt();
        System.out.print("\n");
    
        gambar(inputPanjang, inputLebar);
        System.out.print("\n");
        
        // emngambil input dengan luas(inputPanjang, inputLebar) kedalam fungsi luas dan keliling
        // System.out.println("luas adalah : " + luas(inputPanjang, inputLebar));  
        // System.out.println("keliling adalah " + keliling(inputPanjang, inputLebar));
        
        // atau dengan fungsi
        tampilkan(inputPanjang, inputLebar);
        
    }
    
    // membuat fungsi untuk menampilkan keliling dan luas
    private static void tampilkan(int panjang, int lebar){
        System.out.println("luas adalah : " + luas(panjang, lebar));  
        System.out.println("keliling adalah " + keliling(panjang, lebar));
    }
    
    // emembuat fungsi menghitung luas
    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    
    // membuat fungsi keliling
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    
    // membuat fungsi untuk menggambar
    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i ++){ // kebawah
            for (int j = 0; j < panjang; j++){ // kekanan
            System.out.print("* ");
            }
            System.out.print("\n");
        } 

    } 

}
