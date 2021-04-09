package com.tutorial;

public class Main {
    
    public static void main(String[] args){
    
    /*  syntax
        while(kondisi){
            aksi
        }
    */
    
    int a = 0; // a dimulai dari 0
    boolean kondisi = true;
    
    System.out.println("Mulai");
        
    while (kondisi){ // cek ekspresi apakah true 
        System.out.println("Loop ke " + a); // eksekusi aksi jika true
            
        if (a == 10){ // jika a sama dengan 10 loop akan dihentikan 
        kondisi = false;  // memberhentikan loop ditengah
        }
        
        a++; // increment nilai a agar bertambah
    }
    System.out.println("Selesai");
    
    }

}
