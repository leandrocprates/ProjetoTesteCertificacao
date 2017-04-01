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
public class x {
    
public static void main(String[] args) {
          String p = System.getProperty("x");
          
          System.out.println(p);
          
          for(int i = 0; i < args.length; i++){
            
               System.out.println(" Valor: " + args[i] );
               //if( p.equals(args[i]) ){
               //     System.out.println("found at " + i + " Valor: " + args[i] );
                    //break;
               //}
          }
     }    
    
    
}
