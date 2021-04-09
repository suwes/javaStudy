package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukan nilai " + nilai);
    
        printNilai(nilai);
        System.out.print("\n");
        
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlahnya dalah " + jumlah);
        
        int faktorial = hitungFaktorial(nilai);
        System.out.println("jumlahnya dalah " + faktorial);
    
    }
    
    private static int hitungFaktorial(int parameter){
        System.out.println("nilai ke " + parameter);
        
        if (parameter == 1){
            return parameter; // mengembalikan parameter
        }
        
        return parameter * hitungFaktorial(parameter - 1);  // return
    }
    
    private static int jumlahNilai(int parameter){
        System.out.println("nilai ke " + parameter);
        
        if (parameter == 0){
            return parameter; // mengembalikan parameter
        }
        
        return parameter + jumlahNilai(parameter - 1);  // return
    }
    
    private static void printNilai(int parameter){
        System.out.println("nilai ke " + parameter);
        
        if (parameter == 0){ // kondisi untuk stop rekursif
            return;
        }
        
        // mengurangi nilai dari parameter
        
        printNilai(parameter - 1); // memanggil kembali fungsi
    
    }

}
