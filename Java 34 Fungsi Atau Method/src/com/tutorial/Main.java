package com.tutorial;

public class Main {
    
    public static void main(String[] args){
        
        // contoh membuat fungsi untuk perhitungan
        // y = (x + 2) * x
        // membuat fungsi dengan nama hitung
       
        
        int x,y;
        x = 10;
        y = hitung(x); // memangggil fungsi 
        
        System.out.println("x =" + x + ", y = " + y);
        
        x = 20;
        y = hitung(x); // memangggil fungsi 
        
        System.out.println("x =" + x + ", y = " + y);
        
    }
    
    public static int hitung(int input){ // membuat fungsi dengan nama hitung
        int hasil;
        // isi fungsi
        hasil = (input + 2) * input;
        // menghasilkan nilai
        return hasil;
    }

}
