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

//The result is Red because the conditional statement on line 05 uses the XOR operator 
//(false ^ true) which evaluates to true.

public class Signal {
          public static void main(String[] args) {
               boolean b1 = false;
               boolean b2 = true;
               if(b1 ^ b2)
                    System.out.println("Red");
               else if(b1 & b2)
                    System.out.println("Green");
               else
                    System.out.println("Yellow");
          }
     }
