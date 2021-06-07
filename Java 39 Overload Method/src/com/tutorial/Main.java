package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
        
        int hasilInteger;
        hasilInteger = tambah(4, 5);
        printAngka(hasilInteger);
        
        hasilInteger = tambah(2, 6, 2);
        printAngka(hasilInteger);
        
        
        float hasilFloat;
        hasilFloat = tambah(4, 5.5f);
        printAngka(hasilFloat);
        
        hasilFloat = tambah(4, 4.5f, 4.5f);
        printAngka(hasilFloat);
        
    }
    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(int angkaInt1, float angkaFloat1){
        return angkaInt1 + angkaFloat1;
    }
    
    private static float tambah(int angkaInt1, float angkaFloat1, float angkaFloat2){
        return angkaInt1 + angkaFloat1 + angkaFloat2;
    }
    
    private static void printAngka(int angkaInteger){
        System.out.println("ini adalah angka integer = " + angkaInteger);
    }
    
    private static void printAngka(float angkaFloat){
        System.out.println("ini adalah angka integer = " + angkaFloat);
    }
    
    private static void printAngka(double angkaDouble){
        System.out.println("ini adalah angka integer = " + angkaDouble);
    }

}
