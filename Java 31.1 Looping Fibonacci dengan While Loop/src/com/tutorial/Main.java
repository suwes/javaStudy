package com.tutorial;

import java.util.*;

public class Main {
    public static void main (String[] args){
        
        // menghitung deret nilai fibonacci ke - n
        int fn1, fn2, fn, n;
        Scanner userIinput = new Scanner(System.in);
        
        System.out.print("Masukan nilai ke : ");
        n = userIinput.nextInt();
        
        // deklarasikan nilai awal
        fn2 = 0; 
        fn1 = 1;
        fn = 1;
        
        int i = 0;
        
        while (i < n){
            i++;
            System.out.println("nilai ke " + i + " adalah " + fn);
            fn = fn2 + fn1; // emnghasilkan nilai n ke
            fn2 = fn1; // mengganti nilai fn2
            fn1 = fn; // menggganti nilai fn1
        
        }
    
    
    }
 
}
