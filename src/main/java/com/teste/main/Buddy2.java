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

public class Buddy2 {

    public static void main(String[] args) {
          def: 
          for (byte s = 1; s < 10; s++) {
              //entra se for multiple de 3 
               if (s % 3 == 0){
                    System.out.print(s + ".");
                    continue;
               }
               if (s == 6) {
                    break def;
               }
          }
    }
    
}
