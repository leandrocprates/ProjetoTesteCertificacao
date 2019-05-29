/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

/**
 *
 * @author lprates
 */



class FWD {
          int doMud(int x) { return 1; }
}

class Subaru extends FWD {
     int doMud(int... y) { return 2; } // ultima escolha sempre do compilador 
     int doMud(int z) { return 3; } // sobreescrevendo a funcao , overload 
}

public class Race {
     public static void main(String [] args) {
          int s  = new Subaru().doMud(7);
          System.out.println(s);
                  
          s = new Subaru().doMud(7, 6 ,8 );//nese caso so o 2 
          
          System.out.println(s);
     }
}
