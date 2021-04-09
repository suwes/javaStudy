package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args){
    
        // kalkulatorsederhna dengan if else
        // membuat 3 item yaitu a, operator dan b
        // a dan b adalah float, operator adalah char
        // mengambil a operator dan b satu satu
        
        Scanner userInput;
        float a,b,hasil;
        char operator;
        
        userInput = new Scanner(System.in);
        
        System.out.print("nilai a : ");
        a = userInput.nextFloat();
        System.out.print("Operator : ");
        operator = userInput.next().charAt(0); // mengambil chart pertama saja
        System.out.print("nilai b : ");
        b = userInput.nextFloat();
        
        System.out.println("Kamu memasukan : " + a + " " + operator + " " + b);
        
        // operator yang disediakan yaitu + * / - (bisa ditambah)
        // menggunakan ' ' agar dianggarp char bukan string atau " " 
        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("Hasil adalah : " + hasil);
        } else if (operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.println("Hasil adalah : " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasil adalah : " + hasil);
        } else if (operator == '/'){
            if (b == 0) { // nested if
            System.err.println("Bagi nol akan menghasilakn tak terhingga");
            } else{
            hasil = a / b;
            System.out.println("Hasil adalah : " + hasil);
            }
        } else {
            System.err.println("Operator tidak tersedia"); 
        }
        
        /* jika menggunakan switch
         switch (operator) {
            case '+':
                // penjumlahan
                hasil = a + b;
                System.out.println("Hasil adalah : " + hasil);
                break;
            case '-':
                // pengurangan
                hasil = a - b;
                System.out.println("Hasil adalah : " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("Hasil adalah : " + hasil);
                break;
            case '/':
                if (b == 0) { // nested if
                    System.err.println("Bagi nol akan menghasilakn tak terhingga");
                } else{
                    hasil = a / b; 
                    System.out.println("Hasil adalah : " + hasil);
                }   break;
            default:
                System.err.println("Operator tidak tersedia");
                break;
        }
        */
    
    }

}
