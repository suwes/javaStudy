package com.tutorial;

public class Main {
    
    public static void main(String[] args){
    
        
        int[][] arrayMatrixA = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] arrayMatrixB = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        
        int[][] arrayMatrixC = {
            {1,2},
            {3,4},
        };
        
        int[][] arrayMatrixD = {
            {11,12},
            {13,14},
        };
        
        
        // menambahkan array
        int [][] hasilTambah = tambahArray(arrayMatrixA, arrayMatrixB);
        printArray(hasilTambah);
        
        // megkalikan array
        int [][] hasilKali = kaliArray(arrayMatrixC, arrayMatrixD);
        printArray(hasilKali);
    }
    
    // fungsi kali array
    private static int [][] kaliArray(int [][] dataArray1, int [][] dataArray2){
        int barisA = dataArray1.length;
        int kolomA = dataArray2[0].length;
        int barisB = dataArray2.length;
        int kolomB = dataArray2[0].length;
        
        int [][] hasil = new int[barisA][kolomB];
        
        int buffer;
        for (int i = 0; i< barisA; i++){ // loop baris
            for (int j = 0; j < kolomB; j++){ // loop kolom
                buffer = 0; // pada saat loop setelahnya buffer akan 0 lagi
                for (int k = 0; k < kolomA; k++){
                    buffer += dataArray1[i][k] * dataArray2[k][j];
                } 
                // memindahkan buffer ke hasil[baris][kolom]
                hasil[i][j] = buffer;
            }
        } return hasil;
    }
    
    // fungsi tambah array
    private static int [][] tambahArray(int [][] dataArray1, int [][] dataArray2){
        int barisA = dataArray1.length;
        int kolomA = dataArray2[0].length;
        int barisB = dataArray2.length;
        int kolomB = dataArray2[0].length;
       
        int [][] hasil = new int[barisA][kolomA];
        
        // cek kondisi apakh bisa dijumlahkan
        if (kolomA == kolomB && barisA == barisB){
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomA; j++){
                    // menjumlahkan array di kolom ke[] baris ke[]
                    hasil[i][j] = dataArray1[i][j] + dataArray2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris / kolom tidak sama");
        } return hasil;
    }
    
    // fungsi print array
    
    private static void printArray(int [][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        // looping menulis array 2d manual lengkap
        
        for (int i = 0; i < baris; i++){ // memanggil baris
            System.out.print("[");
            for (int j = 0; j < kolom; j++ ){ // memanggil kolom
                
                // menulis isi array pada baris ke kolom ke
                System.out.print(dataArray[i][j]);
                
                // mennganti koma dengan pentup
                // jika ada di akhir array
                if (j < (kolom - 1)){
                    System.out.print(","); 
                } else {
                    System.out.print("]");
                }
            } System.out.print("\n");
        } System.out.print("\n");
    }

}
