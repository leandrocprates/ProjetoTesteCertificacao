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

 class FWD2 {
          int doMud(int x) { return 1; }
}

class Subaru2 extends FWD2 {
     int doMud(int... y) { return 2; }
     int doMud(long z) { return 3; }
     //int doMud(int w) { return 4; } // caso exista executa polimorfismo 
     
}
class Race2 {
     public static void main(String [] args) {
          FWD2 f = new Subaru2();
          System.out.println(f.doMud(7));
     }
}



