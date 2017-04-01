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

public  class Adder {
          //static Short s1,s2; // nao funciona pois nao e inicializado por padrao 
          static short s1,s2; // fubnciona
          
          public static void main(String [] args) {
              
//              Adder ad = new Adder(); 
//              ad.s1 = 4 ; 
//              System.out.println( ad.s1  + " + " + ad.s2 ) ;  
//              
              
               int x;
               s1 = 4;
               x = s1 + s2;
               
               
               
               
               System.out.print(x);
          }
     }
