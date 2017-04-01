/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

/**
 * Saida 30 31 20 21 
 * @author lprates
 */

public  class Breakfast {
          public static void main(String[] args) {
               free:
                    for(int j = 3; j > 0; j--) {
                         for(int k = 0; k < 4; k++) {
                              if(j == 1) break free;
                              if(k == 2) break;
                              System.out.print(" " + j + k);
                         }
                    }
          }
     }
