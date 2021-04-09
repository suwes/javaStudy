package com.tutorial;
public class Main {
    public static void main(String[] args){
    
    // operasi aritmatika
    
    int variable1 = 15;
    int variable2 = 2;
    
    int hasil;
    
    // 1. penjumlahan
    
    hasil = variable1 + variable2;
    System.out.println(hasil);
    System.out.println("Nilai " + variable1 + " + " + variable2 + " = " + hasil);
    
    // 2. pengurangah
    
    hasil = variable1 - variable2;
    System.out.println(hasil);
    System.out.printf("Nilai %d - %d = %d \n",variable1,variable2,hasil);
    
    // 3. perkalian
    
    hasil = variable1 * variable2;
    System.out.println(hasil);
    System.out.printf("Nilai %d * %d = %d \n",variable1,variable2,hasil);
    
    // 4. pembagian
    
    hasil = variable1 / variable2;
    System.out.println(hasil);
    System.out.printf("Nilai %d / %d = %d \n",variable1,variable2,hasil);
    
    float a = 6;  // menggunakan tipe data float
    float b = 5;
    float hasilFloat = a/b;
    System.out.println(a + " / " + b + " = " + hasilFloat);
    
    // 5. modules (sisa pembagian CONTOH 15 DIBAGI 2 = 12 DAN 12 MAKA SISA 1)
    hasil = variable1 % variable2;
    System.out.println(hasil);
    System.out.printf("Nilai %d %% %d = %d \n",variable1,variable2,hasil);
    
    
    
    }
}
