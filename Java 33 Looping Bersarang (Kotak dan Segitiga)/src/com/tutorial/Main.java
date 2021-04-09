package com.tutorial;

public class Main {
    
    public static void main(String[] args) {
        
        // looping bersarang
        // i untuk kebawah
        // j ke kanan 
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if ( (i+j) ==4){
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ( (i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        
        // wajiksss
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
               if ((i+j)<=3 || (i-j) >=5){
                   System.out.print(" ");
               } else {
                   System.out.print("* ");
               }
               if ((j-i) == 4){
                   break;
               }
               if ((i+j) == 12){
                   break;
               }
            }
            System.out.print("\n");
        }
        
        System.out.println("\n");
        
    }

}
