package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args){
    
        // Latihan Looping Sederhana dengan Do While
        // menghitung nilAI daLam rentang tertentu
        
        int nilaiAwal, nilaiAkhir, total;
        boolean kondisi = true;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukan nilai awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Masukan nilai akhir : ");
        nilaiAkhir = userInput.nextInt();
        
        total = 0;
        
        do {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " sama dengan " + total);
            if (nilaiAwal == nilaiAkhir){ // memberhentikan looping
            kondisi = false;
            }
            nilaiAwal++; // menambah nilaiAwal
        } while (kondisi); // cek kondisi looping
    }

}
