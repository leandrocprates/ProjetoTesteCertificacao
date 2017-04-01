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
public class Test4 {
     public static void main(String [] args) {
          boolean x = true;
          boolean y = false;
          short z = 42;
          
          if((z++ == 42) && (y = true)){
              
              System.out.println("Z: " + z  ) ; 
              
              z++;
              System.out.println("Z: " + z  ) ; 
              System.out.println("y: " + y  ) ; 
          }
          if((x = false) || (++z == 45)) {
              
              System.out.println("Z: " + z  ) ; 
              z++;
              System.out.println("Z: " + z  ) ; 
              System.out.println("x: " + x  ) ; 
              
          }
     
          System.out.println("z = " + z);
     }
   } 