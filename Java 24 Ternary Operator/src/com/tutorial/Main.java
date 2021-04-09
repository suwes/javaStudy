package com.tutorial;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        int input, x;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Msukan nilai : ");
        input = userInput.nextInt();
        
        // ternary opertaor adalah penyederhanaan dari if statment
        // syntax variable x = (expresi) ? ststment_true : statment_false;
        
        x = (input == 10) ? (input*input) : (input/2);
        
        
        /* jika menggunakan if statment
        
        if (input == 10){
            x = input*input;
        } else {
            x = input/2;
        }
        
        */
        
        System.out.println("Nilai hasil ternary " + x);
        
        
        
    }

}
