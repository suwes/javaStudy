package com.tutorial;

public class Main {

    public static void main(String[] args){
    
        // syntax do while
        // do while minmal si aksi di eksekusi 1 kali
        // walaupun fasle karena aksi beada dalam line
        /*
        do {
            aksi;
        } while (kondisi);
        */
        
        System.out.println("Awal program");
        
        int a = 0;
        boolean kondisi = true;
        
        do {
            a++; // menambah 1 nilai a
            System.out.println("do while ke-" + a); // pengulangan
            if (a == 10){ // jika a sudah sampai 10 dari a++
            kondisi = false;  // ubah kondisi yang awalnya true jadi false
            }
        }while (kondisi);
        
        System.out.println("Akhir program");
    }
}
