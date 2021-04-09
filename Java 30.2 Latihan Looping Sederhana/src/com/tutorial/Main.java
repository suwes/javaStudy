package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        // Latihan Looping sederhana dengan For loop
        // menghitung nilai dalam rentang tertentu
        
        int nilaiAwal, nilaiAkhir, total;
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Masukan nilai akhir : ");
        nilaiAkhir = userInput.nextInt();
        
        
        
        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){ // inisialisasi; kodisi; stepnilai
            total = total + nilaiAwal; //eksekusi
            System.out.println("ditambah " + nilaiAwal + " sama dengan " + total);
            
        
        }
    
    }

}
