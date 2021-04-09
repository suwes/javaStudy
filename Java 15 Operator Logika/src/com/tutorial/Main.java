package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // Operator logika adalah operasi yang bisa kita lakukan kepada tipe data boolean
        // ada AND, OR, XOR dan NOT (negasi)
        // OR ditambah
        // AND dikali
        // XOR jika angkanya sama maka hasilnya false
        // NOT untuk membalikan nilai
        
        
        /*
        TABEL AND  TABLE OR  TABLE XOR
        a b c      a b c     a b c
        0 0 0      0 0 0     0 0 0
        0 1 0      0 1 1     0 1 1
        1 1 1      1 0 1     1 0 1
        1 0 0      1 1 1     1 1 0
        
        */
        
        boolean a,b,c;
        
        // OR menggunakan operator (||) jika true nya 1,2,3,4,,, maka dianggap 1
        
        System.out.println("===== OR (||) =====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        
        // AND menggunakan operator (&&) dikali contoh 0x1=0 maka false
        
        System.out.println("===== AND (&&) =====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        
        // XOR menggunakan operator (^) jika ada yang sama maka dianggap false contoh 1^1=0 maka false 
        
        System.out.println("===== XOR (^) =====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        
        // NOT (NEGASI) / flipping menggunakan operator (!)
        System.out.println("===== NOT (negasi) (!) =====");
        a = true;
        c = !a;
        System.out.println(a + " --> ! " + c);
        
        a = false;
        c = !a;
        System.out.println(a + " --> ! " + c);
        
        
        
        
        
    }
}
