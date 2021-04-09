package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        // menhitung nilai dalam rentang tertentu
        
        int nilaiAwal, nilaiAkhir, total;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukan Nilai Awal : ");
        nilaiAwal = userInput.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        nilaiAkhir = userInput.nextInt();
        
        total = 0;
        
        while(nilaiAwal <= nilaiAkhir){ // loop akan berjalan jika
            total = total + nilaiAwal; // membuat total menjadi dummy variable atau nilai bergerak
            
            System.out.println("ditambah " + nilaiAwal + " sama dengan " + total);
            nilaiAwal++; // menambah 1 nilai awal
        
        }
    }

}
