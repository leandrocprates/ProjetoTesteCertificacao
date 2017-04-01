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

public class StringSplit {
          public static void main(String [] args) {

               String s = "x1234 y56 z7 a";
               String [] sa = s.split("\\d");
               
               //String s = "50;60";
               //String [] sa = s.split(";");
               
               
               int count = 0;
               for( String x : sa){
                   System.out.println(x); 
                   count++;
               }
                    
               System.out.println("total: " + count);
          }
}
