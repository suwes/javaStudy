package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner userInput;
        float a,b,hasil;
        String operator;
        
        userInput = new Scanner(System.in);
        System.out.print("Masukan nilai a : ");
        a = userInput.nextFloat();
        System.out.print("Maukan Operator : ");
        operator = userInput.next();
        System.out.print("Masukan nilai b : ");
        b = userInput.nextFloat();
        
        switch (operator){ // di switch bisa menggunakan " "
            case "+":
                // penjumlahan
                hasil = a + b;
                System.out.println("Hasil adalah : " + hasil);
                break;
            case "-":
                // pengurangan
                hasil = a - b;
                System.out.println("Hasil adalah : " + hasil);
                break;
            case "*":
                // perkalian
                hasil = a * b;
                System.out.println("Hasil adalah : " + hasil);
                break;
            case "/":
                // pembagian
                if (b == 0) {
                    System.err.println("Dibagi 0 akan tak terbatas");
                } else {
                hasil = a / b;
                System.out.println("hasil adalah : " + hasil);
                }
                break;
            default:
                System.err.println("Operator " + operator + " tidak cocok");
        }
    }
}
