package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){
        
        String input; // input adalah string
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Panggil nama : ");
        input = userInput.next(); // mengambil input string
    
        // switch case hampir sama dengan if else tetapi expresi switch bisa satuan
        // expresinya berupa Satuan (int,byte,long,short), String da, Enum
        
        switch(input){ // cek ekpresi input
            case "otong":  // cek apakah otong yg dimasukan 
                System.out.println("Saya otong hadir");
                break; // stop aksi jika tidak ada expresi yg ditemukan
            case "rafli":
                System.out.println("Saya rafli hadir");
                break;
            case "ikbal":
                System.out.println("Saya ikbal hadir");
                break;
            default: // jika tidak ada expresi yang terpenuhi
                System.out.println(input + " tidak hadir");
        }
        
        /* Syntax Switch case
        switch (ekspresi){
            case "pilihan1":
                aksi1;
                break;
            case "pilihan2":
                aksi2;
                break;
            default:
                statmentdefault:
        }
        
        */
    
    
    
    
    } 
}
