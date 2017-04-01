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
class TestEnum {
          enum E {N, E, S, W};
          public static void main(String [] args) {
               E e = E.E;
               if(e.equals(E.E)) System.out.print("equals valor ");
               
               if(e == E.E) System.out.print("== referencia  ");
          }
     }