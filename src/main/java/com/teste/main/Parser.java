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

class Parser extends Utils {
        
        public static void main(String [] args) {
               try {
                   System.out.print(new Parser().getInt("42"));
               } catch (Exception e) {
                    System.out.println("Exc"); 
               }
        }
          
        int getInt(String arg)  {
            System.out.println("dentro main... ");
            return Integer.parseInt(arg);
        }
     }


class Utils {
     int getInt(String arg) throws Exception { 
         return 49; 
     }
}
