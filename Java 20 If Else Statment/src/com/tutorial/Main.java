package com.tutorial;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        // tutorial if ststemt atau percabangan
        Scanner userInput = new Scanner(System.in);
        
        int a;
        System.out.println("Mulai");
        System.out.print("Masukkan milai : ");
        a = userInput.nextInt();
        System.out.println("Nilai yang kamu masukkan adalah " +a);
        
        /* Syntax if Statment
        
             if (expresi) {
                aksi/statemnt;
           }
             else {
                aksi/ststemnt;
           }
        */
        
        // ini adalah cabangnya
        if (a == 5) { // didalam () adalah expresi dalam  bentuk boolean
            System.out.println("ini jalur true"); // aksi jika true
        }
        else {
            System.out.println("ini jalur false"); // aksi jika false
        }
        // akhir cabang
        
        System.out.println("Selesai");
    }
}
