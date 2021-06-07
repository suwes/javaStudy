package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        // menambil nilai n dari user
        System.out.print("Masukan nilai : ");
        int nilai = userInput.nextInt();
        
        // memanggil method fibonacci
        int nilai_fibonacci = fibonacci(nilai,"atas");
        
        // menampilkan hasil nilai fibonacci fn
        System.out.println("nilai fibonacci ke " + nilai + " adalah " + nilai_fibonacci);
    }
    
    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke " + n);
        
        if (n == 1 || n == 0){
            return n;
        } else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }

}
