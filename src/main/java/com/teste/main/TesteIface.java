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

interface MyInterface {
         static long boat = 7L; // implicito public final static 
         long myMethod(long x); // implicito public abstract (deve ser sobreescrito)
}


public class TesteIface implements MyInterface {
     public static void main(String[] args) {
          new TesteIface().myMethod(6L);
     }
     
     @Override // necessario public 
     public long myMethod(long x) {
          System.out.println( ((++x * boat) - (--x + 1)) );
          return 42L;
     }
     
}

