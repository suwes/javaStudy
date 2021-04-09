package com.tutorial;

public class Main {
    public static void main(String[] args) {
    // unary adalah operasi yang dilakukan pada satu variable
    
    // unary + dan -
    int angka = 1;
    System.out.printf("unary '+' adalah  %d menjadi %d \n",angka, +angka); // karena + tidak ada perubahan
    System.out.printf("unary '-' adalah  %d menjadi %d \n",angka, -angka);
    
    // unary decrement dan increment
    int angka2 = 10;
    angka2++; // ++ adalah increment
    System.out.println("Nilai dengan '++' adalah = " + angka2);
    
    int angka3 = 10;
    angka3--; // -- adalah decrement
    System.out.println("Nilai dengan '--' adalah " + angka3);
    
    // unary prefix dan postfix
    int a = 5; // prefix mengeksekusi sebelum
    System.out.printf("nilai dengan '++' prefix menjadi %d\n",++a);
        
    int b = 5; // postfix mengeksekusi setelah
    System.out.printf("nilai dengan '++' postfix menjadi %d\n",b++); // hasil belum terkesekusi
    System.out.printf("hasil nilai postfix menjadi %d\n",b); // setelah dieksekusi
    
    
    // unary boolean dengan ! (beng) untuk negasi
    
    boolean ucup = true;
    System.out.println("nilai boolean = " + ucup);
    System.out.println("nilai boolean = " + !ucup); // negasi
        
        
    
    }
    
}
