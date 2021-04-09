package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // operator bitwise adalah operator untuk melakukan operasi pada nilai bit
       
       
        byte a,b,c; // a b c adalah byte
        String a_bits,b_bits,c_bits; // a_bits adalah string
       
        // menyimpan string byte ke dalam a_bits dengan helper string
        // %8s adalah jumlah bit dalam 1 byte
        // helper Integer mengubah string ke binary
        // replace ' ' ke '0'
        // substring untuk menghapus string yang berlebih
        
        // operator bitwise SHIFT LEFT
        System.out.println("======= SHIFT LEFT (<<) =======");
        a = 3;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits, a);
        b = (byte)(a << 2); // casting a ke byte dam mennggeser a ke kiri
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits, b);
        
        // operator bitwise SHIFT RIGHT
        System.out.println("======= SHIFT RIGHT (>>) =======");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits, a);
        b = (byte)(a >> 2); // casting a ke byte dam mennggeser a ke kanan
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits, b);
        
        // operator bitwise OR
        System.out.println("======= OR (|) =======");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits, b);
        System.out.println("-----------------OR");
        c = (byte) (a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n",c_bits, c);
        
        // operator bitwise AND
        System.out.println("======= AND (&)=======");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits, b);
        System.out.println("-----------------AND");
        c = (byte) (a&b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n",c_bits, c);
        
        // operator bitwise XOR
        System.out.println("======= XOR (^) =======");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n",b_bits, b);
        System.out.println("-----------------XOR");
        c = (byte) (a^b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d\n",c_bits, c);
        
        // operator NOT / negasi
        System.out.println("======= NEGASI/NOT (~) =======");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits, a);
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d\n",b_bits, b);
        
    }
}
