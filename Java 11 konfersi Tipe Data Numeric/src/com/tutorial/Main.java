package com.tutorial;

public class Main {

    public static void main(String[] args){
    
        //program untuk konversi data
        
        int nilaiInt = 450; // 32 bit
        System.out.println("Nilai int = " + nilaiInt);
        
        // memperluas rentang tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);
        
        // memperkecil rentang tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; //mengganti nilai int ke byte dengan (byte)
        System.out.println("Nilai byte = " + nilaiByte); // hasil akan aneh karena ukuran lebih dari max byte
        System.out.println("Max byte = " + Byte.MAX_VALUE); // max ukuran% byte, klo dibawah ini tidak akan minus
        
        // casting pembagian
        
        int a = 10;
        float b = 4; // merubah salah satu float agar hasilnya pas
        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c); // %f adalah format float
        
        int x = 10;
        int y = 4;
        float z = (float)x/y; // tanpa merubah tipe data salah satunya dengan (float)
        System.out.printf("%d / %d = %f \n",x,y,z);
        
        
                
        
        
    
    
    
    }





}