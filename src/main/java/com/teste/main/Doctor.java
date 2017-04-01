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

//The ^ operator returns true when exactly one operand is true and other is false
// 2nd will not get printed, because both the operands are true.


public class Doctor {
          public static void main(String[] args) {
               String s = "";
               int x = 2;
               if((7 > (4*2)) ^ (5 != 4)) s += "1st ";
               if((5 < 7) ^ (7 > 5)) s += "2nd ";
               if(((4 * x++) < 9) ^ (x > 3)) s += "3rd ";
               System.out.println(s);
          }
     }
