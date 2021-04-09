package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // latihan if, else if, nested if
        Scanner userInput = new Scanner(System.in);
        int buah1,buah2,buah3;
        
       

        System.out.println("Mulai");
        System.out.println("\n");
        System.out.println("----- LATIHAN -----");

        System.out.println("Mausaka berat buah pertama :");
        buah1 = userInput.nextInt();
        System.out.println("Masukan berat buah kedua :");
        buah2 = userInput.nextInt();
        System.out.println("Masukan berat buah ketiga :");
        buah3 = userInput.nextInt();
        
        // mulai latihan if, else if, nested if

        if (buah1 == 100){
            
            System.out.println("Berat buah pertama benar 100 gram");
            
        } else if (buah2 == 50){ 

            System.out.println("Berat buah kedua benar 50 gram");

        } else if (buah3 == 20){
            
            System.out.println("Nilai buah ketiga benar 20 gram");
        
        } else {
            
            System.out.println("Nilai berat buah salah");  
        
        }
        
        System.out.println("\n");
        System.out.println("Selesai");
    }
    
}
