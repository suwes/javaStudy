package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // perkalian atau pembagian akan  dilakukan terlebih dahulu
        // jika ada dilakukan perkalian dan pembagian maka akan dilakukan dari kiri ke kanan
        // begitu juga dengan penjumlahan atau pengurangan
        
        int hasil;
        hasil = 5 * 10 /2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);
        
        // menggunakan pengelompokan operasi menggunakan ( ) agar dieksekusi berbeda
        hasil = 60 / (2 + 8);
        System.out.println(hasil);
        
        
        // Latihan perhitungan  pengelompokan menggunakan persamaan kuadrat
        Scanner userInput = new Scanner(System.in);
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
       
        int m,x,y,c;
        System.out.print("Masukan nilai x : ");
        x = userInput.nextInt();
        System.out.print("Maukan gardient m : ");
        m = userInput.nextInt();
        System.out.print("Masukan bias c : ");
        c = userInput.nextInt();
        
        y = (m * x * x) + c;
        System.out.println("Nilai y adalah : " + y);
       
    }
    
    
    
}
