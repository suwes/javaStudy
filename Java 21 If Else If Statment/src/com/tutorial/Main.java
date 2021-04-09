package com.tutorial;
import java.util.*;
public class Main {
    
    public static void main(String[] args){
    
        // tutorial if else if statment
        Scanner userInput = new Scanner(System.in);
        
        int a;
        // program mulai
        System.out.println("Mulai");
        
        System.out.print("Mauskan nilai kamu : ");
        a = userInput.nextInt();
        
        // if else if statment
        if (a == 10) {
            System.out.println("Sama dengan nilai pertama"); // print jika a sama dengan 10
        }
        else if (a == 5) { // cek ekpresijika expresi sebelumnya false
            System.out.println("Sama dengan nilai kedua"); // eksekusi ststment jika true
        }
        else if ( a == 15){ // else if bisa lebih dari 2
            System.out.println("Sama dengan nilai ketiga");
        }
        else { // jika tidakada yang true
            System.out.println("Tidak ada nilai yang sama dengan " +a);
        }
        // akhir if else if statment
        
        System.out.println("Akhir");
        
        /* SYNTAX IF ELSE IF 
        
        if (expresi1) {
            ststment1;
        }
        else if (ekspresi2) {
            statment2;
        }
        else {
            default;
        }
        */
    }
}
