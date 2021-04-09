package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        // membuat sebuah objec untuk menangkap input dari user
        Scanner userInput = new Scanner(System.in);
        
        // sebuah program sederhana untuk menebak sebuah angka
        
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.println("TEBAK NILAI");
        System.out.print("Msasukan nilai tebakan kamu : ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("Nilai tebakan kamu adalah " + nilaiTebakan);
        
        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan " + statusTebakan);
        
        // menebak dalam suatu rentang nilai tertentu
        // menggunakan operasi aljabar boolean AND / OR
        
        System.out.print("Masukan nilai tebakan antara 4 sampai 9 : ");
        nilaiTebakan = userInput.nextInt();
        
        // cek nilai satu satu menggunakan ()
        // megecek nilai tebakan menggunakan AND && pada aljabar boolean
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan kamu " +statusTebakan);
        
        /*
        TABEL AND  TABLE OR
        a b c      a b c
        0 0 0      0 0 0
        0 1 0      0 1 1
        1 1 1      1 0 1
        1 0 0      1 1 1
        
        */
        
        
    }
}
