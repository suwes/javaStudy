package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args){
    
    // nested if atau if bersarang
    Scanner userInput = new Scanner(System.in);
    int a,b;
    
    System.out.println("Mulai");
    System.out.print("Masukan nilai a : ");
    a = userInput.nextInt();
    System.out.print("Masukan nilai b : ");
    b = userInput.nextInt();
    
    if (a == 10){ // cek nilai a jika true akan cek nilai b  
        
        if (b == 5) { // jika a true ini akan dieksekusi
        
            System.out.println("Nilai cocok"); // aksi jika expresi a dan b true
            
        } else { // aksi jika expresi a true dan b false
        
            System.out.println("Nilai b tidak cocok"); // aksi jika a true dan  b false
        }
    
    } else { // jika a false ini akan langsung di eksekusi
    
        System.out.println("Nilai a tidak cocok tidak bisa melanjutkan"); // aksi jika a false
        
    }
    
    System.out.println("Akhir");
    
    }

    /* SYNTAX NESTED IF
    if (expresi1) {
        
        if (expresi2) {
           
           ststemnt true;
    
           }
        else {
    
           default2;
    
           }
    }
    else {
    
        default1;
    
    }
    */
}
