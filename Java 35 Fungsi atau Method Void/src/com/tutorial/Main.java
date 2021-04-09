package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
        
        // void itu artinya hampa
        // void hanya melakukan kegiatan saja tanpa kembalian
        
        // memanggil fungsi
        
        selamatPagi("emak"); // mengisi string nama
        selamatPagi("abah");
    }
    
    // membuat fungsi baru dengan nama selamatPagi
    
    private static void selamatPagi(String nama){ 
        System.out.println("selamat pagi " + nama); // mengelakukan kegiatan
    }

}
