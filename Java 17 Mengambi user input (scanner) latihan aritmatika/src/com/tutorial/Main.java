package com.tutorial;

// import library Scanner di java > util > Scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // membuat perhitungan ukuran persegi panjang
        
        // userInput adalah tipe data Scanner dari sistem
        Scanner userInput = new Scanner(System.in); 
        int panjang, lebar, tinggi, luas, volume;
        
        System.out.println("Menghitung luas dan volume");
        
        System.out.print("Masukan panjang : ");
        panjang = userInput.nextInt(); // meminta user memasukan panjang
        
        System.out.print("Masukan luas : ");
        lebar = userInput.nextInt(); // meminta user memasukan luas
        
        luas = panjang * lebar; // menghitung luas
        
        System.out.print("Masukan tinggi : ");
        tinggi = userInput.nextInt(); // meminta user memasukan tinggi
        
        volume = luas*tinggi; // menghitung volume
        System.out.println("Volumenya adalah : " +volume);
        
    }
}
