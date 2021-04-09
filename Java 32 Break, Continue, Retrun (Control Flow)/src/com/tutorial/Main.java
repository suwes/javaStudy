package com.tutorial;

public class Main {
    
    public static void main(String[] args){
    
        // Control Flow ada 3
        // Break, Continue, Retrun
        
        int a = 0;
        
        OUTER:
        while (true) {
            a++;
            
            
            if (a == 10){
                break;
                // keluar dari loop dengan break
            } else if (a == 5){
                continue;
                // memulai aksi dari awal dengan continue
            } else if (a == 7){
                return;
                // menselessikan program
            }
            
            
            /* switch (a) {
                case 10:
                    break OUTER;
                    // keluar dari loop dengan break
                case 5:
                    continue;
                    // memulai aksi dari awal dengan continue
                case 7:
                    return;
                    // menselessikan program
                default:
                    break;
            }*/
            
            System.out.println("looping ke " +a);
        }
        
        
        System.out.println("Akhir Program");
    } 
    

}
