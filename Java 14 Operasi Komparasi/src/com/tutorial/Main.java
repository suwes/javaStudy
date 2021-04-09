package com.tutorial;

public class Main {
 public static void main(String[] args){
        
            // hasil komparasi akan menghasilkan nilai dalam bentuk boolean
            
            int a,b;
            boolean hasilKomparasi; // menangkap hasil
            
            // operator equal atau persamaan
            System.out.println("------- PERSAMAAN");
            a = 10;
            b = 10;
            hasilKomparasi = ( a == b);
            System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
            
            a = 12;
            b = 10;
            hasilKomparasi = ( a == b);
            System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
            
            // operator NOT equal atau tidakpersamaan
            System.out.println("------- TIDAK PERSAMAAN");
            a = 10;
            b = 10;
            hasilKomparasi = ( a != b);
            System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
            
            a = 12;
            b = 10;
            hasilKomparasi = ( a != b);
            System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
            
            // operator LESS THAN atau KURANG DARI
            System.out.println("------- KURANG DARI");
            a = 9;
            b = 10;
            hasilKomparasi = ( a < b);
            System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
            
            a = 12;
            b = 10;
            hasilKomparasi = ( a < b);
            System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
            
            // operator GREETER THAN atau LEBIH DARI
            System.out.println("------- LEBIH DARI");
            a = 9;
            b = 10;
            hasilKomparasi = ( a > b);
            System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
            
            a = 12;
            b = 10;
            hasilKomparasi = ( a > b);
            System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
            
            
            // operator LESS THAN EQUAL atau KURANG DARI ATAU SAMA DENGAN
            System.out.println("------- KURANG DARI SAMA DENGAN");
            a = 9;
            b = 10;
            hasilKomparasi = ( a <= b);
            System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
            
            a = 10;
            b = 10;
            hasilKomparasi = ( a <= b);
            System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
            
            a = 12;
            b = 10;
            hasilKomparasi = ( a <= b);
            System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
            
            
            // operator GREATER THAN EQUAL atau LEBIH DARI ATAU SAMA DENGAN
            System.out.println("------- LEBIH DARI SAMA DENGAN");
            a = 9;
            b = 10;
            hasilKomparasi = ( a >= b);
            System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
            
            a = 10;
            b = 10;
            hasilKomparasi = ( a >= b);
            System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
            
            a = 12;
            b = 10;
            hasilKomparasi = ( a >= b);
            System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
            
            /*
            %s adalah string dari hasilKomparasi ( a == b ) dst
            
            */            
        
        }
}
