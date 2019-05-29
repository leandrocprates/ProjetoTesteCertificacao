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

public class Buddy {
          public static void main(String[] args) {
            
            saida: 
              
            for ( int i = 0 ; i < 10 ; i++){
                  
                        def:
                            for(short s = 1; s < 7; s++) {
                                 if(s == 5) break def;
                                 if(s == 2) continue;
                                 System.out.print(s + ".");
                            }
               
               System.out.println("Contador i : "+ i);
               
            }
              
          }
     }