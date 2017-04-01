/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

class X22 {

    
    //public static void doX() { System.out.println("doX 1 "); }
    static void doX() { System.out.println("doX 2 "); }
    //protected static void doX() { System.out.println("doX 3 "); }
        
    
    
}

public class Find4 {
     public static void main(String [] args) {
          X22 myX = new X22();
          myX.doX();
          X22.doX();
     }
}
