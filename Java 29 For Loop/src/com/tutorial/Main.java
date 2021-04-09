package com.tutorial;

public class Main {

    public static void main(String[] args){
        
        /* syntax
        
        for (inisialisasi; kondisi; step nilai){
            aksi;
        }
        
        */
        
        System.out.println("Awal program");
        System.out.println("Loop pertama");
        
        for (int nilai = 0; nilai <= 10; nilai++){ 
        // jika nilai lebih kecil atau sama dengan 10 maka true dan loop akan berjalan
        // ++ berfungsi menambah nilai
        // loop akan berjalan sampai nilai ke 10
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Loop kedua");
        
        for (int nilai = 0; nilai < 10; nilai++){ 
        // jika nilai lebih kecil dari 10 maka true dan loop akan berjalan
        // 10 tidak di loop karena tidak disebutkan dan hanya lebih kecil dari 10
        // loop akan berjalan sampai nilai ke 9
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Loop ketiga");
        
        for (int nilai = 10; nilai >= 5; nilai--){ 
        // jika nilai lebih besar atau sama dengan 5 maka true dan loop akan berjalan
        // -- berfungsi mengurangi nilai
        // loop akan berjalan ke nilai ke 5
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Loop keempat");
        int nilai = 0; // nilai bisa diletakan diatas
        for (; nilai < 10; nilai++){
            System.out.println("for loop ke-" + nilai);
        }
        
        System.out.println("Akhir Program");
    
    
    }
}
