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

public class Ali {
          public static void main(String[] args) {

         //int y = 7;  //  would require both widening and boxing
         long y = 7; 
         //Long y = 7L;  // necessario o L 
         //Integer y = 7;  // tem que converter para Long objectos nao convertem 
         
               jab(y);
          }
          static void jab(Long x) {
               System.out.println("Long");
          }
     } 